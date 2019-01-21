package testingPortata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.PortataBeanDAO;

public class TestPBDgetIdByNome {
	
	@Test
	public void getIdByNome() {
		assertEquals(1000, pbd.getIdByNome("portata").getIdPortata());
	}
	
	
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
