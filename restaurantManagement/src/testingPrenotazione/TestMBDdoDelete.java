package testingPrenotazione;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.PrenotazioneBean;
import model.PrenotazioneBeanDAO;
import model.UtenteBean;
import model.UtenteBeanDAO;

public class TestMBDdoDelete {
	
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
		pb.setDescrizione("descrizione");
		ubd.doSave(ub);
	}
	
	
	@Test
	public void doDeleteTest() {
		assertEquals(true, pbd.doDelete(pb.getIdPrenotazione()));
	}
	
	
	@After
	public void tearDown() {
		ubd.doDelete(ub.getUsername());
	}
	
	
	private PrenotazioneBean pb = new PrenotazioneBean();
	private PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
	private UtenteBean ub = new UtenteBean();
	private UtenteBeanDAO ubd = new UtenteBeanDAO();
}
