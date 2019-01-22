package model;

import java.util.ArrayList;

import model.UtenteBean;
import model.UtenteBeanDAO;

public class CameriereManager {
	public boolean inserimentoCameriere(String username, String password, String nome, String cognome, String tipo) {
		boolean result = false;
		UtenteBean ub = new UtenteBean();
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		
		ub.setUsername(username);
		ub.setPassword(password);
		ub.setNome(nome);
		ub.setCognome(cognome);
		ub.setTipo(tipo);

		result = ubd.doSave(ub);
		
		return result;
	}
	
	public boolean modificaCameriere(String username, String password, String nome, String cognome, String tipo) {
		boolean result = false;
		UtenteBean ub = new UtenteBean();
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		
		ub.setUsername(username);
		ub.setPassword(password);
		ub.setNome(nome);
		ub.setCognome(cognome);
		ub.setTipo(tipo);

		result = ubd.doUpdate(ub);
	
		return result;
	}
	
	public boolean rimozioneCameriere(String username) {
		boolean result = false;
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		result = ubd.doDelete(username);
		
		return result;
	}

	
	public ArrayList<UtenteBean> getCamerieri() {
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		return (ubd.doRetrieveAllCameriere());
	}
}
