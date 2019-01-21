package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùBeanDAO;

public class TestMBDdoDelete {
	
	@Test
	public void doDeleteTest() {
		assertEquals(true, mbd.doDelete(1000));
	}
	
	
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
