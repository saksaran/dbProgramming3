package dbprogramming3;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
        
public class Dbprogramming3 {
    public static void main(String[] args) {
        
        String URL = "jdbc:mysql://127.0.0.1:3307/mydb3_118";
        String username = "root";
        String password = "1111";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement = con.createStatement();
            String sql = "select * from student";
            ResultSet results = statement.executeQuery(sql);
            
            while(results.next()) {
                System.out.println(results.getString(1) + " " + results.getString(2) + " " + results.getString(3));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
