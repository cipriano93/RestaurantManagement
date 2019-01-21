package testingUtenteManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.UtenteManager;

public class TestUMregistrazione {
	@Test
	public void registrazioneTest() {
		assertEquals(true, um.registrazione("cliente97", "cliente97", "Mario", "Rossi", "cliente"));
	}
	

	private UtenteManager um = new UtenteManager();
}
