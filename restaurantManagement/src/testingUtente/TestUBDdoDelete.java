package testingUtente;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.UtenteBeanDAO;

class TestUBDdoDelete {
	UtenteBeanDAO ubd = new UtenteBeanDAO();
	@Test
	public void doDeleteTest() {
		assertEquals(true, ubd.doDelete("gestore97"));
	}

}
