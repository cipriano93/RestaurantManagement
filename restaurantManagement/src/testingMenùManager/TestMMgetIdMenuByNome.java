package testingMenùManager;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import model.MenùManager;
import model.PrenotazioneManager;

public class TestMMgetIdMenuByNome {
	
	@Test
	public void getIDMenuByNomeTest() {
		assertEquals(65585, mm.getIdMenuByNome("Stella di mare"));
	}
	
	
	private MenùManager mm = new MenùManager();
}
