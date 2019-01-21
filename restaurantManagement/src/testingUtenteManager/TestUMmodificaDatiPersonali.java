package testingUtenteManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.UtenteManager;

public class TestUMmodificaDatiPersonali {
	@Test
	public void modificaDatiPersonaliTest() {
		assertEquals(true, um.modificaDatiPersonali("cameriere97", "cameriere97", "Giuseppe", "rotondo97", "cliente"));
	}
	
	
	private UtenteManager um = new UtenteManager();
}
