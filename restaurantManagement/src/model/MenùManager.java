package model;

import java.util.ArrayList;

public class MenùManager {

	public boolean inserimentoMenù(String nome) {
		MenùBean mb = new MenùBean();
		
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();

		return (mbd.doSave(mb));
	}
	
	
	public boolean modificaNomeMenù(int id, String nome) {
		MenùBean mb = new MenùBean();
		
		mb.setIdMenù(id);
		mb.setNome(nome);
		
		MenùBeanDAO mbd = new MenùBeanDAO();
		
		return (mbd.doUpdate(mb));
	}
	
	
	public boolean rimozioneMenù(int id) {
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
	
	//id del menù
	public ArrayList<PortataBean> getPortate(int id) {
		PortataBeanDAO pbd = new PortataBeanDAO();
		
		return (pbd.doRetrieveByCond(id));
	}
	
	public int getIdMenuByNome(String nome) {
		int id = 0;
		MenùBeanDAO mbd = new MenùBeanDAO();
		ArrayList<MenùBean> menus = mbd.doRetrieveAll();
		for(int i = 0; i < menus.size(); i++) {
			if(menus.get(i).getNome().equals(nome))
				id = menus.get(i).getIdMenù();
		}
		System.out.println("id: " +id);
		return id;
	}
	
	public ArrayList<PortataBean> getPortateByMenuTipo(int idMenù, String tipo){
		ArrayList<PortataBean> portate = new ArrayList<PortataBean>();
		ArrayList<PortataBean> portateByTipo = new ArrayList<PortataBean>();
		
		PortataBeanDAO pbd = new PortataBeanDAO();
		portate = pbd.doRetrieveByCond(idMenù);
		
		for(PortataBean pb: portate) {
			if(pb.getTipo().equals(tipo))
				portateByTipo.add(pb);
		}		
		System.out.println("size: " + portateByTipo.size());
		return portateByTipo;
		
	}
	
	public void stampa(String x) {
		System.out.println("tipo: " +x);
	}
	public PortataBean getPortataByNome(String nome) {
		PortataBeanDAO pbd = new PortataBeanDAO();
		
		return pbd.getIdByNome(nome);
	}
	
	
	
}