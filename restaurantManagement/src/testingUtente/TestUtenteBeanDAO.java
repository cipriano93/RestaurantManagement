package testingUtente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;

class TestUtenteBeanDAO {
	UtenteBean ub = new UtenteBean(); 
	UtenteBean ub1 = new UtenteBean();
	
	UtenteBeanDAO ubd = new UtenteBeanDAO();	
	
	@Test
	public void doSaveTest() {
		ub.setUsername("gestore91111");
		ub.setPassword("gestore93");
		ub.setNome("andrea");
		ub.setCognome("cipriano");
		ub.setTipo("gestore");
		assertEquals(true, ubd.doSave(ub));
	}
	
	@Test
	public void doRetrieveByKeyTest() {
		ub.setUsername("cameriere97");
		ub.setPassword("cameriere97");
		ub.setNome("Giuseppe");
		ub.setCognome("rotondo97");
		ub.setTipo("cameriere");
		assertEquals("cameriere97", ubd.doRetrieveByKey("cameriere97", "cameriere97").getUsername());
	}
	@Test
	public void doRetrieveByOneKeyTest() {
		assertEquals("cameriere97", ubd.doRetrieveByOneKey("cameriere97").getUsername());
	}
	
	@Test
	public void doUpdateTest() {
		ub1.setUsername("cameriere97");
		ub1.setPassword("cameriere97");
		ub1.setNome("Giuseppe");
		ub1.setCognome("rotondo97");
		ub1.setTipo("cameriere");
		assertEquals(true, ubd.doUpdate(ub));
	}
	
	@Test
	public void doDeleteTest() {
		assertEquals(true, ubd.doDelete("gestore91111"));
	}
	
	
}
