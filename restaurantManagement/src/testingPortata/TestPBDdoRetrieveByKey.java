package testingPortata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.PortataBeanDAO;

public class TestPBDdoRetrieveByKey {
	
	@Test
	public void doRetrieveByKeyTest() {
		assertEquals(1000, pbd.doRetrieveByKey(1000).getIdPortata());
	}
	
	
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
