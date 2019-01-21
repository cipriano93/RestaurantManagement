package testingPrenotazioneManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.PrenotazioneManager;

public class TestPMrimozionePrenotazione {
	
	@Test
	public void rimozionePrenotazioneTest() {
		assertEquals(true, pm.rimozionePrenotazione(1000));
	}
	
	
	private PrenotazioneManager pm = new PrenotazioneManager();
}
