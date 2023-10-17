import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class testing_db {
    public static void main(String[]args){

        Statement sqlSt;
        String outPut;
        ResultSet result;
        String SQL = "select * from Login";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/expense_tracker_back_end";
            Connection dbConnection = DriverManager.getConnection(dbURL, "root", "hkldDD3@78");
            sqlSt = dbConnection.createStatement();
            result = sqlSt.executeQuery(SQL);
            while(result.next() != false){
                outPut = result.getString(3);
                System.out.println(outPut);
            }
        

        }
        catch(ClassNotFoundException One){
            Logger.getLogger(testing_db.class.getName()).log(Level.SEVERE,null, One);
            System.out.println("Class not found, check the jar");
        }
        catch(SQLException Two) {
            Logger.getLogger(testing_db.class.getName()).log(Level.SEVERE,null,Two);
            System.out.println("SQL bad");
        }
    }



}
