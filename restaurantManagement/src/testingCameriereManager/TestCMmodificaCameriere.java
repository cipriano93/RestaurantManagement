package testingCameriereManager;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.CameriereManager;
import model.UtenteBean;

public class TestCMmodificaCameriere {

	@Before
	public void setUp() {
		ub.setUsername("cameriere00");
		ub.setPassword("cameriere00");
		ub.setNome("Filippo");
		ub.setCognome("Sudrio");
		ub.setTipo("cameriere");
		cm.inserimentoCameriere(ub.getUsername(), ub.getPassword(), ub.getNome(), ub.getCognome(), ub.getTipo());
	}
	
	
	@Test
	public void modificaCameriereTest() {
		ub.setPassword("cameriere01");
		ub.setNome("Filippa");
		ub.setCognome("Sondrio");
		assertEquals(true, cm.modificaCameriere(ub.getUsername(), ub.getPassword(), ub.getNome(), ub.getCognome(), ub.getTipo()));
	}
	
	
	@After
	public void tearDown() {
		cm.rimozioneCameriere(ub.getUsername());
	}
	
	
	private CameriereManager cm = new CameriereManager();
	private UtenteBean ub = new UtenteBean();
}
