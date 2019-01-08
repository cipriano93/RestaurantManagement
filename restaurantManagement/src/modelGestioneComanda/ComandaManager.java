package modelGestioneComanda;

import java.util.ArrayList;

public class ComandaManager {
	public void prova(String x) {
		System.out.println("ecco il tavolo:  "+ x);
	}
	
	public ArrayList<TavoloBean> aggiornaListaTavoli(ArrayList<TavoloBean> tavoli, int tavolo, int persone) {
		ArrayList<TavoloBean> updateTables = new ArrayList<TavoloBean>();
		System.out.println("tavolo " + tavolo );
		TavoloBean tb = null;
		System.out.println("persone " + persone );		
		tavoli.get(tavolo-1).setNumeroPersone(persone);
		
		return tavoli;
	}
	
	
}
