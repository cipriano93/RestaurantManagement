package modelGestioneMenù;

import java.util.ArrayList;

public class MenùManager {

	public boolean inserimento(String nome) {
		MenùBean mb = new MenùBean();
		
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();

		return (mbd.doSave(mb));
	}
	
	
	public boolean modificaNome(int id, String nome) {
		MenùBean mb = new MenùBean();
		
		mb.setIdMenù(id);
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		return (mbd.doUpdate(mb));
	}
	
	
	public boolean rimozione(int id) {
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		return (mbd.doDelete(id));
	}
	
	
	public boolean inserimentoPortata(int id, String nome, String tipo, String prezzo, String descrizione) {
		PortataBean pb = new PortataBean();
		
		pb.setIdMenù(id);
		pb.setNome(nome);
		pb.setTipo(tipo);
		pb.setPrezzo(prezzo);
		pb.setDescrizione(descrizione);
		
		PortataBeanDAO pbd = new PortataBeanDAO();
		
		return (pbd.doSave(pb));
	}
	
	
	public boolean modificaPortata(int id, String nome, String tipo, String prezzo, String descrizione) {
		PortataBean pb = new PortataBean();
		
		pb.setIdPortata(id);
		pb.setNome(nome);
		pb.setTipo(tipo);
		pb.setPrezzo(prezzo);
		pb.setDescrizione(descrizione);
		
		PortataBeanDAO pbd = new PortataBeanDAO();
		
		return (pbd.doUpdate(pb));
	}
	
	
	public boolean rimozionePortata(int id) {
		PortataBeanDAO pbd = new PortataBeanDAO();
		
		return (pbd.doDelete(id));
	}
	
	
	public ArrayList<MenùBean> getMenùs() {
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		return (mbd.doRetrieveAll());
	}
	
	
	public ArrayList<PortataBean> getPortate(int id) {
		PortataBeanDAO pbd = new PortataBeanDAO();
		
		return (pbd.doRetrieveByCond(id));
	}
}