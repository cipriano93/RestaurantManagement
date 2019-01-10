package modelGestioneAttività;

import java.io.Serializable;

public class AttivitàBean implements Serializable {

	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIndirizzo() {
		return indirizzo;
	}
	
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public int getNum_civ() {
		return num_civ;
	}


	public void setNum_civ(int num_civ) {
		this.num_civ = num_civ;
	}


	public String getPiva() {
		return p_iva;
	}


	public void setPiva(String p_iva) {
		this.p_iva = p_iva;
	}

	public String getProvincia() {
		return provincia;
	}
	
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
	public String getCittà() {
		return città;
	}


	public void setCittà(String città) {
		this.città = città;
	}
	
	
	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	private static final long serialVersionUID = 1L;
	private int num_civ;
	private String nome, indirizzo, p_iva, provincia, città, tel;
}