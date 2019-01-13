package modelGestioneComanda;

import java.util.GregorianCalendar;

public class OrdineBean {

	public int getIdOrdine() {
		return id_ordine;
	}
	
	
	public void setIdOrdine(int id_ordine) {
		this.id_ordine = id_ordine;
	}
	
	
	public GregorianCalendar getData() {
		return data;
	}


	public void setData(GregorianCalendar data) {
		this.data = data;
	}
	
	
	public int getNumCoperti() {
		return num_coperti;
	}


	public void setNumCoperti(int num_coperti) {
		this.num_coperti = num_coperti;
	}


	public double getTotale() {
		return totale;
	}


	public void setTotale(double totale) {
		this.totale = totale;
	}


	private int id_ordine, num_coperti;
	private double totale;
	private GregorianCalendar data;
}
