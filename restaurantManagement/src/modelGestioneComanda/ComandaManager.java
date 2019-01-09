package modelGestioneComanda;

import java.util.ArrayList;

import modelGestioneMenù.PortataBean;

public class ComandaManager {
	public ArrayList<TavoloBean> aggiornaListaTavoli(ArrayList<TavoloBean> tavoli, int tavolo, int persone) {
		ArrayList<TavoloBean> updateTables = new ArrayList<TavoloBean>();
		TavoloBean tb = null;
		tavoli.get(tavolo-1).setNumeroPersone(persone);
		return tavoli;
	}
	public ComandaBean newComanda(int nTavolo, int nPersone) {
		ComandaBean cb = new ComandaBean();
		TavoloBean tb = new TavoloBean();
		tb.setNumeroTavolo(nTavolo);
		tb.setNumeroPersone(nPersone);
		cb.setTavolo(tb);
		
		return cb;
	}
	
	
	public void inserimentoPortataComanda(ComandaBean cb, PortataBean pb,int quantità, String note) {
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setPb(pb);
		pcb.setQuantità(quantità);
		pcb.setNote(note);
		
		cb.addPortataComanda(pcb);
	}
	//da migliorare
	public void rimozionePortataComanda(ComandaBean cb, PortataBean pb, int quantità, String note) {
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setPb(pb);
		pcb.setQuantità(quantità);
		pcb.setNote(note);
		
		cb.removePortataComanda(pcb);
	}
	public void modificaPortataComanda(ComandaBean cb, PortataBean pb, int quantità, String note, boolean consegnato) {
		for(PortataComandaBean pcb: cb.getPortateComanda()) {
			if(pb.getNome().equals(pcb.getPb().getNome()))
				cb.removePortataComanda(pcb);
		}	
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setPb(pb);
		pcb.setQuantità(quantità);
		pcb.setNote(note);
		pcb.setConsegnato(consegnato);
		cb.addPortataComanda(pcb);
	}
	public void stampa(String nomePo, String quantità, String note, String tavo) {
		System.out.println("portata: "+ nomePo);
		System.out.println("quantità: "+ quantità);
		System.out.println("note: "+ note);
		System.out.println("tavolo: "+ tavo);
		
	}
	
	
}
