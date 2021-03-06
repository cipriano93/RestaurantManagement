package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.DriverManagerConnectionPool;

public class OrdineBeanDAO {

	public synchronized boolean doSave(OrdineBean ob) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("INSERT INTO ordine (idordine, data, num_coperti, totale) VALUES (?, ?, ?, ?)");
			
			ps.setLong(1, ob.getIdOrdine());
			ps.setObject(2, new Timestamp(ob.getData().getTimeInMillis()));
			ps.setInt(3, ob.getNumCoperti());
			ps.setDouble(4, ob.getTotale());
			
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
			ps = con.prepareStatement("DELETE FROM ordine WHERE idordine=?");
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
	
	
	public synchronized ArrayList <OrdineBean> doRetrieveByDay() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <OrdineBean> obs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM ordine ORDER BY data DESC");
			ResultSet rs = ps.executeQuery();
			Timestamp ts;
			GregorianCalendar gc = null;
			OrdineBean ob;
			if (rs.next()) {
				ts = (Timestamp) rs.getObject("data");
				gc = new GregorianCalendar();
				gc.setTime(ts);
				ob = new OrdineBean();
				ob.setIdOrdine(rs.getInt("idordine"));
				ob.setData(gc);
				ob.setNumCoperti(rs.getInt("num_coperti"));
				ob.setTotale(rs.getDouble("totale"));
				obs.add(ob);
			}
			while (rs.next()) {
				ts = (Timestamp) rs.getObject("data");
				GregorianCalendar tmp = new GregorianCalendar();
				tmp.setTime(ts);
				if ((gc.get(gc.YEAR)) == (tmp.get(tmp.YEAR)) && (gc.get(gc.MONTH)) == (tmp.get(tmp.MONTH)) &&
						(gc.get(gc.DAY_OF_MONTH)) == (tmp.get(tmp.DAY_OF_MONTH))) {
					ob = new OrdineBean();
					ob.setIdOrdine(rs.getInt("idordine"));
					ob.setData(tmp);
					ob.setNumCoperti(rs.getInt("num_coperti"));
					ob.setTotale(rs.getDouble("totale"));
					obs.add(ob);
				}
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
		return obs;
	}
	
	
	public synchronized ArrayList <OrdineBean> doRetrieveByMonth() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <OrdineBean> obs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM ordine ORDER BY data DESC");
			ResultSet rs = ps.executeQuery();
			Timestamp ts;
			GregorianCalendar gc = null;
			OrdineBean ob;
			if (rs.next()) {
				ts = (Timestamp) rs.getObject("data");
				gc = new GregorianCalendar();
				gc.setTime(ts);
				ob = new OrdineBean();
				ob.setIdOrdine(rs.getInt("idordine"));
				ob.setData(gc);
				ob.setNumCoperti(rs.getInt("num_coperti"));
				ob.setTotale(rs.getDouble("totale"));
				obs.add(ob);
			}
			while (rs.next()) {
				ts = (Timestamp) rs.getObject("data");
				GregorianCalendar tmp = new GregorianCalendar();
				tmp.setTime(ts);
				if ((gc.get(gc.YEAR)) == (tmp.get(tmp.YEAR)) && (gc.get(gc.MONTH)) == (tmp.get(tmp.MONTH))) {
					ob = new OrdineBean();
					ob.setIdOrdine(rs.getInt("idordine"));
					ob.setData(tmp);
					ob.setNumCoperti(rs.getInt("num_coperti"));
					ob.setTotale(rs.getDouble("totale"));
					obs.add(ob);
				}
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
		return obs;
	}
	
	
	public synchronized ArrayList <OrdineBean> doRetrieveByYear() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <OrdineBean> obs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM ordine ORDER BY data DESC");
			ResultSet rs = ps.executeQuery();
			Timestamp ts;
			GregorianCalendar gc = null;
			OrdineBean ob;
			if (rs.next()) {
				ts = (Timestamp) rs.getObject("data");
				gc = new GregorianCalendar();
				gc.setTime(ts);
				ob = new OrdineBean();
				ob.setIdOrdine(rs.getInt("idordine"));
				ob.setData(gc);
				ob.setNumCoperti(rs.getInt("num_coperti"));
				ob.setTotale(rs.getDouble("totale"));
				obs.add(ob);
			}
			while (rs.next()) {
				ts = (Timestamp) rs.getObject("data");
				GregorianCalendar tmp = new GregorianCalendar();
				tmp.setTime(ts);
				if ((gc.get(gc.YEAR)) == (tmp.get(tmp.YEAR))) {
					ob = new OrdineBean();
					ob.setIdOrdine(rs.getInt("idordine"));
					ob.setData(tmp);
					ob.setNumCoperti(rs.getInt("num_coperti"));
					ob.setTotale(rs.getDouble("totale"));
					obs.add(ob);
				}
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
		return obs;
	}
	
	
	public synchronized ArrayList <OrdineBean> doRetrieveAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <OrdineBean> obs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM ordine ORDER BY data DESC");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				OrdineBean ob = new OrdineBean();
				ob.setIdOrdine(rs.getInt("idordine"));
				Timestamp ts = (Timestamp) rs.getObject("data");
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(ts);
				ob.setData(gc);
				ob.setNumCoperti(rs.getInt("num_coperti"));
				ob.setTotale(rs.getDouble("totale"));
				obs.add(ob);
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
		return obs;
	}
	
}