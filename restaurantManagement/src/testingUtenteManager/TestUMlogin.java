package testingUtenteManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;
import model.UtenteManager;

public class TestUMlogin {
	
	@Before
	public void setUp() {
		ub.setUsername("cameriere97");
		ub.setPassword("cameriere97");
		ub.setNome("cameriere");
		ub.setCognome("cameriere");
		ub.setTipo("cameriere");
		um.registrazione("cameriere97", "cameriere97", "cameriere", "cameriere", "cliente");
	}
	
	
	@Test
	public void loginTest() {
		assertEquals(ub.getUsername(), um.login(ub.getUsername(), ub.getPassword()).getUsername());
	}
	
	
	@After
	public void tearDown() {
		ubd.doDelete(ub.getUsername());
	}
	
	
	private UtenteManager um = new UtenteManager();
	private UtenteBeanDAO ubd = new UtenteBeanDAO();
	private UtenteBean ub = new UtenteBean();
}
