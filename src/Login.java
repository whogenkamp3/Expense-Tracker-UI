import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

    public static boolean loginStatus(String usernameToCheck, String passwordToCheck){
        String SQL = "SELECT * FROM Login WHERE user_name = ? AND password = ?";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/expense_tracker_back_end";
            Connection dbConnection = DriverManager.getConnection(dbURL, "root", "hkldDD3@78");

            PreparedStatement preparedStatement = dbConnection.prepareStatement(SQL);
            preparedStatement.setString(1, usernameToCheck);
            preparedStatement.setString(2, passwordToCheck);

            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                return true;
                // Add your logic for successful login here
            }
            preparedStatement.close();
            dbConnection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }


    public static void main(String []args){
        String username = "hi";
        String password = "hi";

        boolean login = loginStatus(username,password);
        System.out.println(login);
    }

}


