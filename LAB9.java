package dbprogramming3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB9 {
    public static void main(String[] args) {
        
        String URL = "jdbc:mysql://127.0.0.1:3307/mydb3_118";
        String username = "root";
        String password = "1111";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "insert into student(studentID, firstName, lastName, email, deptID)" +  "values('651118','saksaran','akra','saksaran.akra@gmail.com','IT') ";
            statement.execute(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
