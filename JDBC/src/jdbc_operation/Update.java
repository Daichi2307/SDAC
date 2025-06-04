package jdbc_operation;

import java.sql.*;

public class Update {
	
    public static void main(String[] args) {
    	
        String url = "jdbc:mysql://localhost:3306/sdac";
        String user = "root";
        String password = ""; 

        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url, user, password);

            String updateQuery = "UPDATE user SET id = ? WHERE name = ?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Shristi");

            int rows = pstmt.executeUpdate();
            System.out.println("Updated rows: " + rows);

            con.close();
            
        } catch (Exception e) {
        	
            e.printStackTrace();
        }
    }
}
