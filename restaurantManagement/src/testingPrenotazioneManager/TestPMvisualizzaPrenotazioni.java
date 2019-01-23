package testingPrenotazioneManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.PrenotazioneBean;
import model.PrenotazioneBeanDAO;
import model.PrenotazioneManager;
import model.UtenteBean;
import model.UtenteBeanDAO;

public class TestPMvisualizzaPrenotazioni {
	
	@Before
	public void setUp() {
		ub.setUsername("cliente85");
		ub.setPassword("cliente85");
		ub.setNome("Paolo");
		ub.setCognome("Flora");
		ub.setTipo("cliente");
		
		pb.setData(new GregorianCalendar());
		pb.setNumPersone(10);
		pb.setTelefono("0123456789");
		pb.setDescrizione("compleanno 10 anni");
		ubd.doSave(ub);
		pbd.doSave(pb, ub.getUsername());
	}
	
	@Test
	public void visualizzaPrenotazioniTest() {
		prenotazioni = pm.visualizzaPrenotazioni(ub.getUsername());
		assertEquals(1, prenotazioni.size());
	}
	
	@After
	public void tearDown() {
		prenotazioni.clear();
		pbd.doDelete(pb.getIdPrenotazione());
		ubd.doDelete(ub.getUsername());
	}
	
	@Test
	public void testForException() {
		try {
			Object o = prenotazioni.get(0);
		} catch (IndexOutOfBoundsException i) {
			
		}
	}
	
	private PrenotazioneManager pm = new PrenotazioneManager();
	private PrenotazioneBean pb = new PrenotazioneBean();
	private PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
	private UtenteBean ub = new UtenteBean();
	private UtenteBeanDAO ubd = new UtenteBeanDAO();
	private ArrayList<PrenotazioneBean> prenotazioni = new ArrayList<PrenotazioneBean>();
}
