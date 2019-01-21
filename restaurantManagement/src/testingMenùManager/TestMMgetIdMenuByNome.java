package testingMenùManager;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import model.PrenotazioneManager;

public class TestMMgetIdMenuByNome {
	
	@Test
	public void prenotaTavoloTest() {
		assertEquals(true, pm.prenotaTavolo("cliente93", new GregorianCalendar(), 7, "3333333333", "ottima cameriera"));
	}
	
	
	private PrenotazioneManager pm = new PrenotazioneManager();
}
