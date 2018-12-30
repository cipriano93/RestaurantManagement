package modelGestioneMenù;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelConnection.DriverManagerConnectionPool;

public class PortataBeanDAO {
	
	public synchronized boolean doSave(PortataBean pb) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DriverManagerConnectionPool.getConnection();
			String query = "INSERT INTO portata(idportata, idmenù, nome, tipo, prezzo, descrizione) values (?, ?, ?, ?, ?, ?)";
			
			ps = conn.prepareStatement(query);
			ps.setLong(1, pb.getIdPortata());
			ps.setLong(2, pb.getIdMenù());
			ps.setString(3, pb.getNome());
			ps.setString(4, pb.getTipo());
			ps.setString(5, pb.getPrezzo());
			ps.setString(6, pb.getDescrizione());
			
			int i = ps.executeUpdate();
			
			if(i != 0) {
				return true;	
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return false;
	}
	
	
	public synchronized boolean doDelete(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("DELETE FROM portata WHERE idportata=?");
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
	
	
	public synchronized boolean doUpdate(PortataBean pb) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DriverManagerConnectionPool.getConnection();
			String query = "UPDATE portata SET nome=?, tipo=?, prezzo=?, descrizione=? WHERE idportata=?";
			
			ps = conn.prepareStatement(query);
			ps.setLong(1, pb.getIdPortata());
			ps.setString(2, pb.getNome());
			ps.setString(3, pb.getPrezzo());
			ps.setString(4, pb.getDescrizione());
			
			int i = ps.executeUpdate();
			
			if(i != 0)
				return true;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	public synchronized PortataBean doRetrieveByKey(int idPortata) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			PortataBean pb = new PortataBean();
			pb.setIdPortata(idPortata);
			conn = DriverManagerConnectionPool.getConnection();
			ps = conn.prepareStatement("SELECT * FROM portata WHERE idportata=?");
			ps.setLong(1, idPortata);
			
			ResultSet res = ps.executeQuery();
			
			if(res.next()) {
				pb.setIdMenù(res.getInt("idMenù"));
				pb.setNome(res.getString("nome"));
				pb.setTipo(res.getString("tipo"));
				pb.setPrezzo(res.getString("prezzo"));
				pb.setDescrizione(res.getString("descizione"));
				return pb;
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
	//la condizione è l'idmenù
	public synchronized ArrayList<PortataBean> doRetrieveByCond(int idMenù) {
		ArrayList<PortataBean> result = new ArrayList<PortataBean>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {	
			conn = DriverManagerConnectionPool.getConnection();

			ps = conn.prepareStatement("SELECT * FROM portata WHERE idmenu=?");
			ps.setLong(1, idMenù);
			
			ResultSet items = ps.executeQuery();
			
			while(items.next()) {
				PortataBean pb = new PortataBean();
				
				String id = items.getString("idportata");
				Integer idPortata = Integer.parseInt(id);
				pb.setIdPortata(idPortata);
				pb.setIdMenù(idMenù);
				pb.setTipo(items.getString("tipo"));
				pb.setPrezzo(items.getString("prezzo"));
				pb.setDescrizione(items.getString("descizione"));
				
				result.add(pb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;	 
	 }
	
}
