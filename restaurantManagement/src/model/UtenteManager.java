package model;

public class UtenteManager {
	public UtenteBean login(String username, String password) {
		UtenteBeanDAO ubd = new UtenteBeanDAO();
	
		UtenteBean ub = ubd.doRetrieveByKey(username, password);
		
		return ub;
	}
	
	public boolean registrazione(String username, String password, String nome, String cognome, String tipo) {
		boolean result = false;
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		UtenteBean ub = new UtenteBean();
		ub.setUsername(username);
		ub.setPassword(password);
		ub.setNome(nome);
		ub.setCognome(cognome);
		ub.setTipo(tipo);
		
		result = ubd.doSave(ub);

		return result;
	}
	
	public boolean modificaDatiPersonali(String username, String password, String nome, String cognome, String tipo) {
		boolean result = false;
		UtenteBeanDAO ubd = new UtenteBeanDAO();
		UtenteBean ub = new UtenteBean();
		ub.setUsername(username);
		ub.setPassword(password);
		ub.setNome(nome);
		ub.setCognome(cognome);
		ub.setTipo(tipo);
		
		result = ubd.doUpdate(ub);

		return result;
	}
	
}
