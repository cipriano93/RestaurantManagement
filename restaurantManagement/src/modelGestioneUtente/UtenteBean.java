package modelGestioneUtente;

public class UtenteBean {
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getName() {
		return nome;
	}

	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	
	public String getCognome() {
		return cognome;
	}

	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	public String getType() {
		return tipo;
	}

	
	public void setType(String tipo) {
		this.tipo = tipo;
	}
	
	
	private String username, password, nome, cognome, tipo;
}