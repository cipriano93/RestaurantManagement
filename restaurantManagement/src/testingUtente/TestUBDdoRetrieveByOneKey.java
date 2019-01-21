package testingUtente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.UtenteBeanDAO;

class TestUBDdoRetrieveByOneKey {
	UtenteBeanDAO ubd = new UtenteBeanDAO();
	
	@Test
	public void doRetrieveByOneKeyTest() {
		assertEquals("cameriere97", ubd.doRetrieveByOneKey("cameriere97").getUsername());
	}
	

}
