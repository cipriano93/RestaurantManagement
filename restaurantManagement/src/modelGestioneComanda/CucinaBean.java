package modelGestioneComanda;

import java.util.ArrayList;

public class CucinaBean {

	public void setComande(ArrayList<ComandaBean> comande) {
		this.comande = comande;
	}
	
	
	public ArrayList<ComandaBean> getComande() {
		return comande;
	}
	
	
	private ArrayList<ComandaBean> comande = new ArrayList<ComandaBean>();
}