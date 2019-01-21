package testingUtente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import model.UtenteBean;
import model.UtenteBeanDAO;

class TestDoSave {
	UtenteBean ub = new UtenteBean(); 
	UtenteBeanDAO ubd = new UtenteBeanDAO();	

	@Test
	public void doSaveTest() {
		ub.setUsername("gestore97");
		ub.setPassword("gestore97");
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
		ub.setUsername("cameriere97");
		ub.setPassword("cameriere97");
		ub.setNome("Giuseppe");
		ub.setCognome("rotondo97");
		ub.setTipo("cameriere");
		assertEquals(true, ubd.doUpdate(ub));
	}
	/*
	@Test
	public void doDeleteTest() {
		assertEquals(true, ubd.doDelete("gestore89"));
	}
	*/
	
}
