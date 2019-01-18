package model;

import java.util.ArrayList;

public class ComandaBean {
	public void setTavolo(TavoloBean tb1) {
		tb = tb1;
	}
	public TavoloBean getTavolo() {
		return tb;
	}
	//inserire controllo
	public void addPortataComanda(PortataComandaBean pcb) {
		portateCB.add(pcb);
	}
	//inserire controllo
	public void removePortataComanda(PortataComandaBean pcb) {
		portateCB.remove(pcb);
	}
	public int getSizeAllPortate() {
		return portateCB.size();
	}
	public ArrayList<PortataComandaBean> getPortateConsegnate() {
		ArrayList<PortataComandaBean> portate = new ArrayList<PortataComandaBean>();
		for(PortataComandaBean pcb: portateCB) {
			if(pcb.isConsegnato() == true)
				portate.add(pcb);
		}
		return portate;
	}
	public ArrayList<PortataComandaBean> getPortateNonConsegnate() {
		ArrayList<PortataComandaBean> portate = new ArrayList<PortataComandaBean>();
		for(PortataComandaBean pcb: portateCB) {
				if(pcb.isConsegnato() == false)
					portate.add(pcb);
		}
		
		return portate;
	}
	public ArrayList<PortataComandaBean> getPortateComanda() {
		return portateCB;
	}
	
	
	public double getTotale() {
		int size = getSizeAllPortate();
		double tot = 0;
		for (int i = 0; i < size; i++) {
			PortataComandaBean pcb = portateCB.get(i);
			if (pcb.isConsegnato())
				tot += Double.parseDouble(pcb.getPb().getPrezzo());
		}
		return tot;
	}
	
	
	//Variabili d'istanza
	private TavoloBean tb;
	private ArrayList<PortataComandaBean> portateCB = new ArrayList<PortataComandaBean>();
	
	
}
