package jdbc_ps_diff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {

	public void insert(int id, String name) {
		String sql = "INSERT INTO user (id, name) VALUES (?, ?)";

		try (Connection con = DBConnection.getConnection(); 
				
				PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.executeUpdate();
			System.out.println("User inserted.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
