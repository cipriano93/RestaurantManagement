package testingUtente;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;

public class TestUBDdoRetrieveByKey {
	UtenteBean ub = new UtenteBean();
	UtenteBeanDAO ubd = new UtenteBeanDAO();
	
	@Test
	public void doRetrieveByKeyTest() {
		ub.setUsername("cameriere97");
		ub.setPassword("cameriere97");
		ub.setNome("Giuseppe");
		ub.setCognome("rotondo97");
		ub.setTipo("cameriere");
		assertEquals("cameriere97", ubd.doRetrieveByKey("cameriere97", "cameriere97").getUsername());
	}
}
