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
	public boolean addPortataComanda(PortataComandaBean pcb) {
		return (portateCB.add(pcb));
	}
	//inserire controllo
	public boolean removePortataComanda(PortataComandaBean pcb) {
		int size = portateCB.size();
		portateCB.remove(pcb);
		if (size == portateCB.size())
			return false;
		else
			return true;
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
	
	
	//Variabili d'istanza
	private TavoloBean tb;
	private ArrayList<PortataComandaBean> portateCB = new ArrayList<PortataComandaBean>();
	
	
}
