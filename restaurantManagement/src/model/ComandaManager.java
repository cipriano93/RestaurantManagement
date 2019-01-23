package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.PortataBean;

public class ComandaManager {
	public ArrayList<TavoloBean> aggiornaListaTavoli(ArrayList<TavoloBean> tavoli, int tavolo, int persone) {
		ArrayList<TavoloBean> updateTables = new ArrayList<TavoloBean>();
		TavoloBean tb = null;
		tavoli.get(tavolo-1).setNumeroPersone(persone);
		return tavoli;
	}
	public ComandaBean creaComanda(int nTavolo, int nPersone) {
		ComandaBean cb = new ComandaBean();
		TavoloBean tb = new TavoloBean();
		tb.setNumeroTavolo(nTavolo);
		tb.setNumeroPersone(nPersone);
		cb.setTavolo(tb);
		
		return cb;
	}
	
	
	public boolean inserimentoPortataComanda(ComandaBean cb, PortataBean pb, int quantità, String note) {
		boolean presente = false;
		boolean inserita = false;
		boolean modificata = false;
		PortataComandaBean tmp = null;
		for(int i = 0; i < cb.getSizeAllPortate() && !presente; i++) {
			tmp = cb.getPortateComanda().get(i);
			if(tmp.getPb().getIdPortata() == pb.getIdPortata()) {
				int valore = tmp.getQuantità();
				tmp.setQuantità(valore + quantità);
				presente = modificata = true;
			}
		}
		if(!presente) {
			PortataComandaBean pcb = new PortataComandaBean();
			pcb.setPb(pb);
			pcb.setQuantità(quantità);
			pcb.setNote(note);
			inserita = cb.addPortataComanda(pcb);
		}
		if (inserita || modificata)
			return true;
		else
			return false;
	}
	//da migliorare
	public boolean rimozionePortataComanda(ComandaBean cb, int id) {
		PortataComandaBean pcb = new PortataComandaBean();
		for(int i = 0; i < cb.getSizeAllPortate(); i ++) {
			pcb = cb.getPortateComanda().get(i);
			if(id == pcb.getPb().getIdPortata()) {
				return (cb.removePortataComanda(pcb));
			}
		}
		return false;
	}
	public boolean modificaPortataComandaQuantity(ComandaBean cb, int idPor, int quantità) {
		int q = 0;
		for(PortataComandaBean pcb: cb.getPortateComanda()) {
			if(idPor == pcb.getPb().getIdPortata()) {
				pcb.setOldQuantità();
				pcb.setQuantità(quantità);
				q = quantità;
			}
		}
		if (q == quantità)
			return true;
		else
			return false;
	}
	public boolean modificaPortataComandaStato(ComandaBean cb, int idPor, boolean consegnato) {
		boolean verity = false;
		for(PortataComandaBean pcb: cb.getPortateComanda()) {
			if(idPor == pcb.getPb().getIdPortata()) {
				pcb.setConsegnato(consegnato);
				verity = pcb.isConsegnato();
			}
		}
		if (verity == consegnato)
			return true;
		else
			return false;
	}
	
	
	public boolean inviaComanda(CucinaBean c, ComandaBean cb) {
		c.contains(cb);
		return (c.addComanda(cb));
	}
	
	
	public boolean inserimentoOrdine(ComandaBean cb, double tot) {
		OrdineBean ob = new OrdineBean();
		ob.setData(new GregorianCalendar());
		ob.setNumCoperti(cb.getTavolo().getNumeroPersone());
		ob.setTotale(tot);
		
		OrdineBeanDAO obd = new OrdineBeanDAO();
		return (obd.doSave(ob));
	}
	
	
	public ArrayList<OrdineBean> getOrdini() {
		return (new OrdineBeanDAO().doRetrieveAll());
	}
	
	
	public ArrayList<OrdineBean> getOrdiniByLastDay() {
		return (new OrdineBeanDAO().doRetrieveByDay());
	}
	
	
	public ArrayList<OrdineBean> getOrdiniByLastMonth() {
		return (new OrdineBeanDAO().doRetrieveByMonth());
	}
	
	
	public ArrayList<OrdineBean> getOrdiniByLastYear() {
		return (new OrdineBeanDAO().doRetrieveByYear());
	}
	
	
	public void stampa(String nomePo, String quantità, String note, String tavo) {
		System.out.println("portata: "+ nomePo);
		System.out.println("quantità: "+ quantità);
		System.out.println("note: "+ note);
		System.out.println("tavolo: "+ tavo);
		
	}
}
