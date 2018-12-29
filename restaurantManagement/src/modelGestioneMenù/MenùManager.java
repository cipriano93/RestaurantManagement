package modelGestioneMenù;

public class MenùManager {
//inserimento
	public boolean inserisci(int id, String nome) {
		boolean result = false;
		MenùBean mb = new MenùBean();
		//ho tolto il set
		
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		result = mbd.doSave(mb);

		return result;
	}
	
	//Ok
	public boolean modificaNome(int id, String nome) {
		boolean result = false;
		MenùBean mb = new MenùBean();
		//qui invece lo devi settare, perchè il menù già esiste e quindi già lo conosci
		mb.setIdMenù(id);
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		result = mbd.doUpdate(mb);
		
		return result;
	}
	
	//rimozione
	public boolean rimuovi(int id) {
		boolean result = false;
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		result = mbd.doDelete(id);
		
		return result;
	}
	
	/*
	 * inserimento portata
	 * modifica portata
	 * rimozione portata
	 */
	
	
	
}
