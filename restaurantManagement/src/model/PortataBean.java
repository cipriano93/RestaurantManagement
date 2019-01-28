package model;

import java.util.concurrent.ThreadLocalRandom;

public class PortataBean {
	
	public PortataBean() {
		idPortata = ThreadLocalRandom.current().nextInt(10000, 99999 + 1);
	}
	

	public int getIdPortata() {
		return idPortata;
	}
	
	
	public void setIdPortata(int idPortata) {
		this.idPortata = idPortata;
	}
	
	
	public int getIdMenù() {
		return idMenù;
	}
	
	public void setIdMenù(int idMenù) {
		this.idMenù = idMenù;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	
	private int idPortata;
	private int idMenù;
	private String nome, tipo, descrizione, prezzo;
}
