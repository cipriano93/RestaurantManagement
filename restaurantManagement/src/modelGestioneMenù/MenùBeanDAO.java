package modelGestioneMenù;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelConnection.DriverManagerConnectionPool;

public class MenùBeanDAO {
	
	public synchronized  boolean doSave(MenùBean mb) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("INSERT INTO menu VALUES (?, ?)");
			ps.setInt(1, mb.getIdMenù());
			ps.setString(2, mb.getNome());
			ps.executeUpdate();
			con.commit();
			return true;
		} catch (SQLException e) {
			return false;
		} finally {
			try {
				DriverManagerConnectionPool.releaseConnection(con);
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public synchronized MenùBean doRetrieveByKey(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			MenùBean mb = new MenùBean();
			mb.setIdMenù(id);
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM menu WHERE idmenu=?");
			ps.setInt(1, 0);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				mb.setNome(rs.getString("nome"));
				return mb;
			} 
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				DriverManagerConnectionPool.releaseConnection(con);
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
