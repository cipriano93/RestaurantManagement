package testingPrenotazioneManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.PrenotazioneBean;
import model.PrenotazioneManager;

public class TestPMvisualizzaPrenotazioni {
	
	@Before
	public void setUp() {
		prenotazioni = new ArrayList<PrenotazioneBean>();
	}
	
	
	@Test
	public void visualizzaPrenotazioniTest() {
		prenotazioni = pm.visualizzaPrenotazioni("cliente93");
		assertEquals(true, pm.visualizzaPrenotazioni("cliente93").size() > 0);
	}
	
	
	@After
	public void tearDown() {
		prenotazioni = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = prenotazioni.get(0);
	}
	
	
	private ArrayList<PrenotazioneBean> prenotazioni;
	private PrenotazioneManager pm = new PrenotazioneManager();
}
