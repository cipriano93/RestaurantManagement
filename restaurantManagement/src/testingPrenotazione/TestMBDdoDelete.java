package testingPrenotazione;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.PrenotazioneBeanDAO;

public class TestMBDdoDelete {
	
	@Test
	public void doDeleteTest() {
		assertEquals(true, pbd.doDelete(1000));
	}
	
	
	private PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
}
