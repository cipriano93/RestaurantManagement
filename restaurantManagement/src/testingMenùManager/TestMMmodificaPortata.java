package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMmodificaPortata {
	
	@Test
	public void prenotaTavoloTest() {
		assertEquals(true, mm.modificaPortata(1000, "portata1", "primo", "3.00", "descrizione"));
	}
	
	
	private MenùManager mm = new MenùManager();
}
