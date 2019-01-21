package testingUtenteManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.UtenteManager;

public class TestUMlogin {
	
	@Test
	public void loginTest() {
		assertEquals("cameriere97", um.login("cameriere97", "cameriere97").getUsername());
	}
	
	
	private UtenteManager um = new UtenteManager();
}
