package model;

import java.util.ArrayList;

public class CucinaBean {
	
	public ArrayList<ComandaBean> getComande() {
		return comande;
	}
	
	
	public void setComande(ArrayList<ComandaBean> comande) {
		this.comande = comande;
	}
	
	
	public ComandaBean getComanda(int index) {
		return (comande.get(index));
	}
	
	
	public int getSize() {
		return (comande.size());
	}
	
	
	public void contains(ComandaBean comanda) {
		boolean found = false;
		int size = comande.size();
		for (int i = 0; i < size && !found; i++) {
			ComandaBean cb = comande.get(i);
			if ((cb.getTavolo().getNumeroTavolo()) == (comanda.getTavolo().getNumeroTavolo())) {
				comande.remove(i);
				found = true;
			}
		}
	}
	
	
	public boolean addComanda(ComandaBean cb) {
		return (comande.add(cb));
	}
	
	
	public ComandaBean removeComanda(int index) {
		return (comande.remove(index));
	}
	
	
	private ArrayList<ComandaBean> comande = new ArrayList<>();
}