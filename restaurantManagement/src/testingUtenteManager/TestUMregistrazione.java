package testingUtenteManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.UtenteManager;

public class TestUMregistrazione {
	@Test
	public void registrazioneTest() {
		assertEquals(true, um.registrazione("cameriere97", "cameriere97", "Giuseppe", "rotondo97", "cliente"));
	}
	
	
	private UtenteManager um = new UtenteManager();
}
