import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;

public class ManagingExpenses {
    private static double totalExpense;
    private static double monthlyTotal;

    public static double getTotalExpense(int login_id) {
        String SQL = "SELECT SUM(amount) AS total FROM Expense WHERE fk_login_id = ?";
        String login_id_String = login_id + "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/expense_tracker_backend";
            Connection dbConnection = DriverManager.getConnection(dbURL, "root", "hkldDD3@78");

            PreparedStatement preparedStatement = dbConnection.prepareStatement(SQL);
            preparedStatement.setString(1, login_id_String);

            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                totalExpense = result.getDouble("total");
            }

            preparedStatement.close();
            dbConnection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagingExpenses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagingExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }

        return totalExpense;
    }

    public static double monthly_total(int month, int year, int login_id){
        String sql = "SELECT SUM(amount) AS total_amount FROM Expense WHERE MONTH(purchase_date) = ? and YEAR(purchase_date) = ? and fk_login_id = ?;";

        String monthString = month + "";
        String yearString = year + "";
        String login_id_string = login_id + "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/expense_tracker_backend";
            Connection dbConnection = DriverManager.getConnection(dbURL, "root", "hkldDD3@78");

            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setString(1, monthString);
            preparedStatement.setString(2,yearString);
            preparedStatement.setString(3, login_id_string);

            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                monthlyTotal = result.getDouble("total_amount");
            }

            preparedStatement.close();
            dbConnection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagingExpenses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagingExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monthlyTotal;
    }

    public static Map<String, String> monthly_total_by_category(int login_id){
        Map<String, String> dictionary = new HashMap<>();
        String login_id_string = login_id + "";
        String sql = "SELECT category, SUM(amount) AS total_amount FROM Expense WHERE fk_login_id = ? GROUP BY category";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/expense_tracker_backend";
            Connection dbConnection = DriverManager.getConnection(dbURL, "root", "hkldDD3@78");

            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            preparedStatement.setString(1, login_id_string);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                String category = result.getString("category");
                double totalAmount = result.getDouble("total_amount");
                dictionary.put(category, String.valueOf(totalAmount));
            }

            preparedStatement.close();
            dbConnection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManagingExpenses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManagingExpenses.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dictionary;
    }

    public static void main(String []args){
        //double total = getTotalExpense(1);
        //System.out.println(total);
        //double totalOne = monthly_total(5,2022,1);
        //System.out.println(totalOne);
        Map<String, String> monthlyTotalByCategory = monthly_total_by_category(1);
        for (Map.Entry<String, String> entry : monthlyTotalByCategory.entrySet()) {
            String category = entry.getKey();
            String totalAmount = entry.getValue();
            System.out.println("Category: " + category + ", Total Amount: " + totalAmount);
        }
    }
}
