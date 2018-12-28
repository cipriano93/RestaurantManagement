package modelGestioneAttività;

public class AttivitàBean {

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


	public String getPIva() {
		return p_iva;
	}


	public void setPIva(String p_iva) {
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


	private String nome, indirizzo, p_iva, provincia, città, tel;
}
