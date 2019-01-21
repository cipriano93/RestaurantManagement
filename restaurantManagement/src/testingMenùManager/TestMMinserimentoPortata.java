package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMinserimentoPortata {
	
	@Test
	public void inserimentoPortataTest() {
		assertEquals(true, mm.inserimentoPortata(55442, "Affettato misto", "antipasto", "2.5", "i sapori del sud"));
	}	

	private MenùManager mm = new MenùManager();
}
