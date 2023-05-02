package dbprogramming3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB14 {
    public static void main(String[] args) {
        
        String URL = "jdbc:mysql://127.0.0.1:3307/mydb3_118";
        String username = "root";
        String password = "1111";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            DatabaseMetaData dbMetaData = con.getMetaData();
            System.out.println("database URL : " + dbMetaData.getURL());
            System.out.println("database product name : " + dbMetaData.getDatabaseProductName());
            System.out.println("database product version : " + dbMetaData.getDatabaseProductVersion());
            System.out.println("JDBC driver name : " + dbMetaData.getDriverName());
            System.out.println("JDBC driver version : " + dbMetaData.getDriverVersion());
            System.out.println("JDBC driver major version : " + dbMetaData.getDriverMajorVersion());
            System.out.println("JDBC driver minor version : " + dbMetaData.getDriverMinorVersion());
            System.out.println("Max number of connection : " + dbMetaData.getMaxConnections());
            System.out.println("MaxTableNameLength : " + dbMetaData.getMaxTableNameLength());
            System.out.println("MaxColumnsInTable : " + dbMetaData.getMaxColumnsInTable());
            con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

