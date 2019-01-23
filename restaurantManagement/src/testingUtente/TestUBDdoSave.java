package testingUtente;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;

public class TestUBDdoSave {
	private UtenteBean ub = new UtenteBean();
	private UtenteBeanDAO ubd = new UtenteBeanDAO();
	
	
	@Before
	public void setUp() {
		ub.setUsername("gestore85");
		ub.setPassword("gestore85");
		ub.setNome("Paolo");
		ub.setCognome("Flora");
		ub.setTipo("gestore");
	}
	
	
	@Test
	public void doSaveTest() {
		assertEquals(true, ubd.doSave(ub));
	}
	
	
	@After
	public void tearDown() {
		ubd.doDelete(ub.getUsername());
	}
}
