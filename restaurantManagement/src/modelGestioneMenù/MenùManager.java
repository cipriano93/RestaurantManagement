package modelGestioneMenù;

public class MenùManager {

	public boolean inserisci(int id, String nome) {
		boolean result = false;
		MenùBean mb = new MenùBean();
		
		mb.setIdMenù(id);
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		result = mbd.doSave(mb);

		return result;
	}
	
	
	public boolean modificaNome(int id, String nome) {
		boolean result = false;
		MenùBean mb = new MenùBean();
		
		mb.setIdMenù(id);
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		result = mbd.doUpdate(mb);
		
		return result;
	}
	
	
	public boolean rimuovi(int id) {
		boolean result = false;
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		result = mbd.doDelete(id);
		
		return result;
	}
}
