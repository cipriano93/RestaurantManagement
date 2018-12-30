package modelGestioneMenù;

import java.util.concurrent.ThreadLocalRandom;

public class MenùBean {

	public MenùBean() {
		idMenù = ThreadLocalRandom.current().nextInt(10000, 99999 + 1);
	}
	public int getIdMenù() {
		return idMenù;
	}
	
	public void setIdMenù(int idMenù) {
		this.idMenù = idMenù;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	private int idMenù;
	private String nome;
}
