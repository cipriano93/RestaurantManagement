package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AttivitàManager {

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
			out = new ObjectOutputStream (new FileOutputStream("/Users/andreacipriano/git/RestaurantManagement/restaurantManagement/src/file.txt")); // inserire il path del file
			out.writeObject(ab);
			out.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}
}