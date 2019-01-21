package testingPrenotazione;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.PrenotazioneBean;
import model.PrenotazioneBeanDAO;

public class TestPBDdoRetrieveAll {
	
	@Before
	public void setUp() {
		prenotazioni = new ArrayList<PrenotazioneBean>();
	}
	
	
	@Test
	public void doRetrieveAllTest() {
		assertEquals(true, pbd.doRetrieveAll().size() > 0);
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
	private PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
}
