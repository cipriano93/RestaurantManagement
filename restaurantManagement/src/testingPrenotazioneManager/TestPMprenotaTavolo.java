package testingPrenotazioneManager;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.PrenotazioneBean;
import model.PrenotazioneBeanDAO;
import model.PrenotazioneManager;
import model.UtenteBean;
import model.UtenteBeanDAO;

public class TestPMprenotaTavolo {
	@Before
	public void setUp() {
		
		pb.setData(new GregorianCalendar());
		pb.setNumPersone(10);
		pb.setTelefono("0123456789");
		pb.setDescrizione("compleanno 2 anni");
		ubd.doSave(ub);
	}
	
	@Test
	public void prenotaTavoloTest() {
		assertEquals(true, pm.prenotaTavolo("medico68", pb.getData(), pb.getNumPersone(), pb.getTelefono(), pb.getDescrizione()));
	}
	
	@After
	public void tearDown() {
		pbd.doDelete(pb.getIdPrenotazione());
	}
	
	private PrenotazioneManager pm = new PrenotazioneManager();
	private PrenotazioneBean pb = new PrenotazioneBean();
	private PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
	private UtenteBean ub = new UtenteBean();
	private UtenteBeanDAO ubd = new UtenteBeanDAO();
}
