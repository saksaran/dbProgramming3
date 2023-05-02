package dbprogramming3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB15 {
    public static void main(String[] args) {
        
        String URL = "jdbc:mysql://127.0.0.1:3307/mydb3_118";
        String username = "root";
        String password = "1111";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = results.getMetaData();
            System.out.println(rsMetaData.getColumnCount());
            
            for(int i = 1 ; i <= rsMetaData.getColumnCount(); i++) {
                System.out.println(rsMetaData.getColumnName(i));
            }
            
            while(results.next()) {
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++) 
                       System.out.printf("%-12s\t", results.getObject(i));
                System.out.println();
                
                    
            }


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

