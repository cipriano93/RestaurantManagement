package testingUtenteManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;
import model.UtenteManager;

public class TestUMregistrazione {
	
	@Before
	public void setUp() {
		ub.setUsername("cliente97");
		ub.setPassword("cliente97");
		ub.setNome("Mario");
		ub.setCognome("Rossi");
		ub.setTipo("cliente");
	}
	
	
	@Test
	public void registrazioneTest() {
		assertEquals(true, um.registrazione(ub.getUsername(), ub.getPassword(), ub.getNome(), ub.getCognome(), ub.getTipo()));
	}
	
	
	@After
	public void tearDown() {
		ubd.doDelete(ub.getUsername());
	}
	

	private UtenteManager um = new UtenteManager();
	private UtenteBeanDAO ubd = new UtenteBeanDAO();
	private UtenteBean ub = new UtenteBean();
}
