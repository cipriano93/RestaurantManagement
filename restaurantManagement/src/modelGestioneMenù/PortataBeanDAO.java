package modelGestioneMenù;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
