package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMmodificaNomeMenù {
	
	@Test
	public void rimozionePrenotazioneTest() {
		assertEquals(true, mm.modificaNomeMenù(1000, "menu"));
	}
	
	
	private MenùManager mm = new MenùManager();
}
