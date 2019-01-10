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
		boolean presente = false;
		PortataComandaBean tmp = null;
		for(int i = 0; i < cb.getSizeAllPortate() && !presente; i++) {
			tmp = cb.getPortateComanda().get(i);
			if(tmp.getPb().getIdPortata() == pb.getIdPortata()) {
				int valore = tmp.getQuantità();
				tmp.setQuantità(valore + quantità);
				presente = true;
			}
		}
		if(!presente) {
			PortataComandaBean pcb = new PortataComandaBean();
			pcb.setPb(pb);
			pcb.setQuantità(quantità);
			pcb.setNote(note);
			cb.addPortataComanda(pcb);
		}
	}
	//da migliorare
	public void rimozionePortataComanda(ComandaBean cb, int id) {
		PortataComandaBean pcb = new PortataComandaBean();
		for(int i = 0; i < cb.getSizeAllPortate(); i ++) {
			pcb = cb.getPortateComanda().get(i);
			if(id == pcb.getPb().getIdPortata()) {
				cb.removePortataComanda(pcb);
			}
		}
	}
	public void modificaPortataComandaQuantity(ComandaBean cb, int idPor, int quantità) {
		for(PortataComandaBean pcb: cb.getPortateComanda()) {
			if(idPor == pcb.getPb().getIdPortata()) {
				pcb.setOldQuantità();
				pcb.setQuantità(quantità);
			}
		}	
	}
	public void modificaPortataComandaStato(ComandaBean cb, int idPor, boolean consegnato) {
		for(PortataComandaBean pcb: cb.getPortateComanda()) {
			if(idPor == pcb.getPb().getIdPortata()) {
				pcb.setConsegnato(consegnato);
			}
		}	
	}
	public void stampa(String nomePo, String quantità, String note, String tavo) {
		System.out.println("portata: "+ nomePo);
		System.out.println("quantità: "+ quantità);
		System.out.println("note: "+ note);
		System.out.println("tavolo: "+ tavo);
		
	}
	
	
}
