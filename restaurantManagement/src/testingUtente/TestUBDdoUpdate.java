package testingUtente;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;

class TestUBDdoUpdate {
	UtenteBean ub = new UtenteBean();
	UtenteBeanDAO ubd = new UtenteBeanDAO();
		
	@Test
	public void doUpdateTest() {
		ub.setUsername("cameriere97");
		ub.setPassword("cameriere97");
		ub.setNome("Giuseppe");
		ub.setCognome("rotondo97");
		ub.setTipo("cameriere");
		assertEquals(true, ubd.doUpdate(ub));
	}
}
