package modelGestionePrenotazione;

import java.util.GregorianCalendar;

public class PrenotazioneBean {
	
	public PrenotazioneBean() {
		
	}

	public int getIdPrenotazione() {
		return id_prenotazione;
	}
	
	
	public void setIdPrenotazione(int id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}
	
	
	public GregorianCalendar getData() {
		return data;
	}
	
	
	public void setData(GregorianCalendar data) {
		this.data = data;
	}


	public int getNumPersone() {
		return num_persone;
	}


	public void setNumPersone(int num_persone) {
		this.num_persone = num_persone;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	private int id_prenotazione, num_persone;
	private String descrizione;
	private GregorianCalendar data;
}
