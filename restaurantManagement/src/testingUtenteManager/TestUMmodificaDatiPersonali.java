package testingUtenteManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;
import model.UtenteManager;

public class TestUMmodificaDatiPersonali {
	
	@Before
	public void setUp() {
		ub.setUsername("cameriere97");
		ub.setPassword("cameriere97");
		ub.setNome("Giuseppe");
		ub.setCognome("rotondo97");
		ub.setTipo("cliente");
		ubd.doSave(ub);
	}
	
	
	@Test
	public void modificaDatiPersonaliTest() {
		ub.setPassword("cameriere1997");
		ub.setNome("Peppino");
		ub.setCognome("Rotondo");
		assertEquals(true, um.modificaDatiPersonali(ub.getUsername(), ub.getPassword(), ub.getNome(), ub.getCognome(), ub.getTipo()));
	}
	
	
	
	@After
	public void tearDown() {
		ubd.doDelete(ub.getUsername());
	}
	
	
	private UtenteManager um = new UtenteManager();
	private UtenteBean ub = new UtenteBean();
	private UtenteBeanDAO ubd = new UtenteBeanDAO();
}
