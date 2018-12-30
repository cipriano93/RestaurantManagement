package modelGestionePrenotazione;

import java.util.ArrayList;

import modelGestioneUtente.UtenteBean;
import modelGestioneUtente.UtenteBeanDAO;

public class PrenotazioneManager {
	public boolean prenotaTavolo() {
		boolean result = false;
		
		
		
		return result;
	}
	
	public boolean rimozionePrenotazione(int idPrenotazione) {
		boolean result = false;
		PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
		
		result = pbd.doDelete(idPrenotazione);
		
		return result;
	}
	
	public ArrayList<PrenotazioneBean> visualizzaPrenotazioni(String username){
		ArrayList<PrenotazioneBean> prenotazioni = new ArrayList<PrenotazioneBean>();
		PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
		
		UtenteBean ub = new UtenteBean();
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		
		ub = ubd.doRetrieveByOneKey(username);
		
		if(ub.getTipo().equals("gestore"))
			prenotazioni = pbd.doRetrieveAll();
		else
			prenotazioni = pbd.doRetrieveAllByKey(username);
		
		return prenotazioni;
		
	}
}
