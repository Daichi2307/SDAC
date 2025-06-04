package jdbc_try_catch;

import java.sql.*;

public class Main {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdac", "root", "");

				Statement stmt = con.createStatement();

				ResultSet rs = stmt.executeQuery("SELECT * FROM user"))

		{

			while (rs.next()) {

				System.out.println(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
