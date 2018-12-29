package modelGestioneMenù;

public class MenùManager {

	public boolean inserisci(int id, String nome) {
		boolean result = false;
		MenùBeanDAO mbd = new MenùBeanDAO();
		MenùBean mb = new MenùBean();
		
		mb.setIdMenù(id);
		mb.setNome(nome);
		
		result = mbd.doSave(mb);

		return result;
	}
	
	
	public boolean modificaNome(int id, String nome) {
		boolean result = false;
		MenùBeanDAO mbd = new MenùBeanDAO();
		MenùBean mb = new MenùBean();
		
		mb.setIdMenù(id);
		mb.setNome(nome);
		
		result = mbd.doUpdate(mb);
		
		return result;
	}
}
