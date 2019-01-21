package testingUtente;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.UtenteBeanDAO;

class TestUBDdoRetrieveByOneKey {
	UtenteBeanDAO ubd = new UtenteBeanDAO();
	
	@Test
	public void doRetrieveByOneKeyTest() {
		assertEquals("cameriere97", ubd.doRetrieveByOneKey("cameriere97").getUsername());
	}
	

}
