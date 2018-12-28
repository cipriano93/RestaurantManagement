package modelGestioneMenù;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelConnection.DriverManagerConnectionPool;

public class MenùBeanDAO {
	
	public synchronized  boolean doSave(MenùBean mb) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("INSERT INTO menu (idmenu, nome) VALUES (?, ?)");
			ps.setLong(1, mb.getIdMenù());
			ps.setString(2, mb.getNome());
			ps.executeUpdate();
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
			ps = con.prepareStatement("SELECT nome FROM menu WHERE idmenu=?");
			ps.setInt(1, id);
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
	
	
	public synchronized boolean doDelete(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("DELETE FROM menu WHERE idmenu=?");
			ps.setInt(1, id);
			ps.executeUpdate();
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
	
	
	public synchronized ArrayList <MenùBean> doRetrieveAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <MenùBean> mbs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM menu");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MenùBean mb = new MenùBean();
				mb.setIdMenù(rs.getInt("idmenu"));
				mb.setNome(rs.getString("nome"));
				mbs.add(mb);
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
		return mbs;
	}
}