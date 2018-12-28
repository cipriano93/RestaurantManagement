package modelGestionePrenotazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import modelConnection.DriverManagerConnectionPool;

public class PrenotazioneBeanDAO {
	
	public synchronized  boolean doSave(PrenotazioneBean pb, String username) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("INSERT INTO prenotazione (idmenu, username, data, num_persone, descrizione) VALUES (?, ?, ?, ?, ?)");
			ps.setLong(1, pb.getIdPrenotazione());
			ps.setString(2, username);
			ps.setObject(3, pb.getData());
			ps.setInt(4, pb.getNumPersone());
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
	
	
	public synchronized boolean doDelete(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("DELETE FROM prenotazione WHERE idprenotazione=?");
			ps.setInt(1, id);
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
	
	
	public synchronized ArrayList <PrenotazioneBean> doRetrieveAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <PrenotazioneBean> pbs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM prenotazione");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				PrenotazioneBean pb = new PrenotazioneBean();
				pb.setIdPrenotazione(rs.getInt("idprenotazione"));
				pb.setData((GregorianCalendar) rs.getObject("data"));
				pb.setNumPersone(rs.getInt("num_persone"));
				pbs.add(pb);
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
		return pbs;
	}
}
