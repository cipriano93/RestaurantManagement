package testingUtente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.UtenteBeanDAO;

class TestUBDdoDelete {
	UtenteBeanDAO ubd = new UtenteBeanDAO();
	@Test
	public void doDeleteTest() {
		assertEquals(true, ubd.doDelete("gestore89"));
	}

}
