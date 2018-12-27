package modelGestioneMenù;

public class PortataBean {

	public int getId_portata() {
		return id_portata;
	}
	
	
	public void setId_portata(int id_portata) {
		this.id_portata = id_portata;
	}
	
	
	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	private int id_portata;
	private double prezzo;
	private String nome, descrizione;
}
