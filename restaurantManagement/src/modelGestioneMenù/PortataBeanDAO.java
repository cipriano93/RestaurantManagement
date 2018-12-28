package modelGestioneMenù;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public synchronized PortataBean doRetrieveByKey(int idPortata, int idMenù) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			PortataBean pb = new PortataBean();
			pb.setIdPortata(idPortata);
			pb.setIdMenù(idMenù);
			
			ResultSet res = ps.executeQuery();
			
			if(res.next()) {
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
	
	
}
