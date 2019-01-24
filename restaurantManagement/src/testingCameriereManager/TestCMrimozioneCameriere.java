package testingCameriereManager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CameriereManager;
import model.UtenteBean;

public class TestCMrimozioneCameriere {
	
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
	public void rimozioneCameriereTest() {
		assertEquals(true, cm.rimozioneCameriere(ub.getUsername()));
	}
	
	
	private CameriereManager cm = new CameriereManager();
	private UtenteBean ub = new UtenteBean();
}
