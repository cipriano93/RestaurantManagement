package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AttivitàManager {
	
	private String path = System.getProperty("user.dir") + "/attività.txt"; 

	public boolean modificaDatiAttività(String name, String p_iva, String provincia, String città, String address, int num_civ, String tel) {
		AttivitàBean ab = new AttivitàBean();
		ab.setNome(name);
		ab.setPiva(p_iva);
		ab.setProvincia(provincia);
		ab.setCittà(città);
		ab.setIndirizzo(address);
		ab.setNum_civ(num_civ);
		ab.setTel(tel);
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream (new FileOutputStream(path)); 
			out.writeObject(ab);
			out.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	
	public String getNomeRistorante() {
		AttivitàBean ab = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
			ab = (AttivitàBean) in.readObject();
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return ab.getNome();
	}
}