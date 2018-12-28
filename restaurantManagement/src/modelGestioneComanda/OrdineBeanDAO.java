package modelGestioneComanda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import modelConnection.DriverManagerConnectionPool;

public class OrdineBeanDAO {

	public synchronized boolean doSave(OrdineBean ob) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("INSERT INTO ordine (idordine, data, totale) VALUES (?, ?, ?)");
			ps.setLong(1, ob.getIdOrdine());
			ps.setObject(2, ob.getData());
			ps.setDouble(3, ob.getTotale());
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
	
	
	public synchronized ArrayList <OrdineBean> doRetrieveAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList <OrdineBean> obs = new ArrayList<>();
		try {
			con = DriverManagerConnectionPool.getConnection();
			ps = con.prepareStatement("SELECT * FROM menu");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				OrdineBean ob = new OrdineBean();
				ob.setIdOrdine(rs.getInt("idordine"));
				ob.setData((GregorianCalendar) rs.getObject("data"));
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
