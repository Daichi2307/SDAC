package jdbc_operation;

import java.sql.*;

public class Create {
    public static void main(String[] args) {
    	
        String url = "jdbc:mysql://localhost:3306/sdac";
        String user = "root";
        String password = ""; 

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String insertQuery = "INSERT INTO user (id, name) VALUES (?, ?)";
            
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            
            pstmt.setInt(1, 5);
            pstmt.setString(2, "anisha");

            int rows = pstmt.executeUpdate();
            
            System.out.println("Inserted rows: " + rows);

            con.close();
            
        } catch (Exception e) {
        	
            e.printStackTrace();
        }
    }
}
