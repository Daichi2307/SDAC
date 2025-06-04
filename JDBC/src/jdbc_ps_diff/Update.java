package jdbc_ps_diff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public void update(int id, String newName) {
		String sql = "UPDATE user SET name = ? WHERE id = ?";

		try (Connection con = DBConnection.getConnection(); 
				
				PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, newName);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("User updated.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
