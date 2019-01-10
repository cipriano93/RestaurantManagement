package modelGestioneComanda;

import modelGestioneMenù.PortataBean;

public class PortataComandaBean {
	public PortataComandaBean() {
		consegnato = false;
		old_quantità = 0;
	}
	public PortataBean getPb() {
		return pb;
	}
	public void setPb(PortataBean pb) {
		this.pb = pb;
	}
	public int getQuantità() {
		return new_quantità;
	}
	public void setQuantità(int quantità) {
		if (old_quantità == 0)
			this.old_quantità = quantità;
		this.new_quantità = quantità;
	}
	public void setOldQuantità() {
		old_quantità = new_quantità;
	}
	public boolean diversaQuantità() {
		return (old_quantità == new_quantità);
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
	private PortataBean pb;
	private int old_quantità, new_quantità;
	private String note;
	private boolean consegnato;
}
