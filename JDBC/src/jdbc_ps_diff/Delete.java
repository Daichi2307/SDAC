package jdbc_ps_diff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public void delete(int id) {
		String sql = "DELETE FROM user WHERE id = ?";

		try (Connection con = DBConnection.getConnection(); 
				
				PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("User deleted.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
