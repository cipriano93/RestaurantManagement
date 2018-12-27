package modelGestionePrenotazione;

import java.util.GregorianCalendar;

public class PrenotazioneBean {

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


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	private int id_prenotazione;
	private String descrizione;
	private GregorianCalendar data;
}
