package modelGestioneMenù;

public class MenùBean {

	public int getIdMenù() {
		return id_menù;
	}
	
	
	public void setIdMenù(int id_menù) {
		this.id_menù = id_menù;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	private int id_menù;
	private String nome;
}
