package model;

public class TavoloBean {
	public void setNumeroPersone(int numPersone) {
		numeroPersone = numPersone;
	}
	public void setNumeroTavolo(int numTavolo) {
		numeroTavolo = numTavolo;
	}
	
	public int getNumeroTavolo() {
		return numeroTavolo;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	private int numeroTavolo, numeroPersone;
	
}
