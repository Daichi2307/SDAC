package jdbc_operation;

import java.sql.*;

public class Delete {
	
    public static void main(String[] args) {
    	
        String url = "jdbc:mysql://localhost:3306/sdac";
        String user = "root";
        String password = ""; 

        try {
        	
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url, user, password);

            String deleteQuery = "DELETE FROM user WHERE name = ?";
            
            PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            pstmt.setString(1, "asle");

            int rows = pstmt.executeUpdate();
            System.out.println("Deleted rows: " + rows);

            con.close();
            
        } catch (Exception e) {
        	
            e.printStackTrace();
        }
    }
}
