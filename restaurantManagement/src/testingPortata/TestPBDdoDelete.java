package testingPortata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.PortataBeanDAO;

public class TestPBDdoDelete {
	
	@Test
	public void doDeleteTest() {
		assertEquals(true, pbd.doDelete(1000));
	}
	
	
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
