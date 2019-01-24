package testingCameriereManager;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.CameriereManager;
import model.UtenteBean;

public class TestCMinserimentoCameriere {
	
	@Before
	public void setUp() {
		ub.setUsername("cameriere00");
		ub.setPassword("cameriere00");
		ub.setNome("Filippo");
		ub.setCognome("Scala");
		ub.setTipo("cameriere");
	}
	

	@Test
	public void inserimentoCameriereTest() {
		assertEquals(true, cm.inserimentoCameriere(ub.getUsername(), ub.getPassword(), ub.getNome(), ub.getCognome(), ub.getTipo()));
	}
	
	
	@After
	public void tearDown() {
		cm.rimozioneCameriere(ub.getUsername());
	}
	
	
	private CameriereManager cm = new CameriereManager();
	private UtenteBean ub = new UtenteBean();
}
