package modelGestionePrenotazione;

import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

public class PrenotazioneBean {
	
	public PrenotazioneBean() {
		idPrenotazione = ThreadLocalRandom.current().nextInt(10000, 99999 + 1);
	}

	public int getIdPrenotazione() {
		return idPrenotazione;
	}
	
	
	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
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


	private int idPrenotazione, num_persone;
	private String descrizione;
	private GregorianCalendar data;
}
