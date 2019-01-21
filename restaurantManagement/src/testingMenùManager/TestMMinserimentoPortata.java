package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMinserimentoPortata {
	
	@Test
	public void prenotaTavoloTest() {
		assertEquals(true, mm.inserimentoPortata(1000, "portata", "antipasto", "2.5", "descrizione"));
	}	
	
	
	private MenùManager mm = new MenùManager();
}
