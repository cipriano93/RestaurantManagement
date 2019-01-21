package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.DriverManagerConnectionPool;

public class PrenotazioneBeanDAO {
	
	public synchronized  boolean doSave(PrenotazioneBean pb, String username) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			
			String query = "INSERT INTO prenotazione (idprenotazione, username, data,  num_persone, telefono, descrizione) VALUES (?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(query);
		
			ps.setLong(1, pb.getIdPrenotazione());
			ps.setString(2, username);
			ps.setObject(3, new Timestamp(pb.getData().getTimeInMillis()));
			ps.setInt(4, pb.getNumPersone());
			ps.setString(5, pb.getTelefono());
			ps.setString(6, pb.getDescrizione());
			
			ps.executeUpdate();
			return true;
			
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
		return false;
	}
	
	public synchronized boolean doDelete(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("DELETE FROM prenotazione WHERE idprenotazione=?");
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
	
	public synchronized ArrayList<PrenotazioneBean> doRetrieveAllByKey(String username) {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <PrenotazioneBean> pbs = new ArrayList<>();
		
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM prenotazione WHERE username=? ORDER BY data DESC");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				PrenotazioneBean pb = new PrenotazioneBean();
				pb.setIdPrenotazione(rs.getInt("idprenotazione"));
				Timestamp ts = (Timestamp) rs.getObject("data");
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(ts);
				pb.setData(gc);
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
	
	public synchronized ArrayList<PrenotazioneBean> doRetrieveAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <PrenotazioneBean> pbs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM prenotazione ORDER BY data DESC");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				PrenotazioneBean pb = new PrenotazioneBean();
				pb.setIdPrenotazione(rs.getInt("idprenotazione"));
				Timestamp ts = (Timestamp) rs.getObject("data");
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(ts);
				pb.setData(gc);
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