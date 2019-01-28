package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DriverManagerConnectionPool;

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
	
	
	public synchronized boolean doUpdate(MenùBean mb) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DriverManagerConnectionPool.getConnection();
			String query = "UPDATE menu SET nome=? WHERE idmenu=?";
			
			ps = conn.prepareStatement(query);
			ps.setString(1, mb.getNome());
			ps.setLong(2, mb.getIdMenù());
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			return false;
		} finally {
			try {
				DriverManagerConnectionPool.releaseConnection(conn);
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
	
	
	public synchronized ArrayList <MenùBean> doRetrieveAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <MenùBean> mbs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM menu ORDER by nome ASC");
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
	//
	public MenùBean getIdByNome(String nome) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			MenùBean mb = new MenùBean();
			mb.setNome(nome);
			conn = DriverManagerConnectionPool.getConnection();
			ps = conn.prepareStatement("SELECT * FROM menu WHERE nome=?");
			ps.setString(1, nome);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				mb.setIdMenù(rs.getInt("idmenu"));
				mb.setNome(rs.getString("nome"));
				return mb;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				DriverManagerConnectionPool.releaseConnection(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 return null;	 
	}
	
}