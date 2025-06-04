package jdbc_ps;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Show {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Connection con = Main.GetConnection();
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM user");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
