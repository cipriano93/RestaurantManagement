package modelGestionePrenotazione;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelConnection.DriverManagerConnectionPool;

public class PrenotazioneBeanDAO {
	
	public synchronized  boolean doSave(PrenotazioneBean pb, String username) {/**/
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			String descrizione = pb.getDescrizione();
			if (descrizione == null)
				ps = con.prepareStatement("INSERT INTO menu VALUES (?, ?, ?, ?)");
			else
				ps = con.prepareStatement("INSERT INTO menu VALUES (?, ?, ?, ?, ?)");
			ps.setInt(1, pb.getIdPrenotazione());
			ps.setString(2, username);
			Date date = new Date(pb.getData().getTimeInMillis());
			ps.setDate(3, date);
			ps.setInt(4, pb.getNumPersone());
			if (descrizione != null)
				ps.setString(5, pb.getDescrizione());
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
}
