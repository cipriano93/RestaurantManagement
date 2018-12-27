package modelGestioneComanda;

import java.util.GregorianCalendar;

public class OrdineBean {

	public int getId_ordine() {
		return id_ordine;
	}
	
	
	public void setId_ordine(int id_ordine) {
		this.id_ordine = id_ordine;
	}
	
	
	public double getTotale() {
		return totale;
	}


	public void setTotale(double totale) {
		this.totale = totale;
	}


	public GregorianCalendar getData() {
		return data;
	}


	public void setData(GregorianCalendar data) {
		this.data = data;
	}


	private int id_ordine;
	private double totale;
	private GregorianCalendar data;
}
