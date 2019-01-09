package modelGestioneComanda;

import modelGestioneMenù.PortataBean;

public class PortataComandaBean {
	public PortataComandaBean() {
		consegnato = false;
	}
	public PortataBean getPb() {
		return pb;
	}
	public void setPb(PortataBean pb) {
		this.pb = pb;
	}
	public int getQuantità() {
		return quantità;
	}
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public boolean isConsegnato() {
		return consegnato;
	}
	public void setConsegnato(boolean consegnato) {
		this.consegnato = consegnato;
	}
	
	//Variabili d'istanza
	PortataBean pb;
	int quantità;
	String note;
	boolean consegnato;
}
