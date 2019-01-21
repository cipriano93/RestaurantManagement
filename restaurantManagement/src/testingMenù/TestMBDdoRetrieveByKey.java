package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùBeanDAO;

public class TestMBDdoRetrieveByKey {
	
	@Test
	public void doRetrieveByKeyTest() {
		assertEquals(1000, mbd.doRetrieveByKey(1000).getIdMenù());
	}
	
	
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
