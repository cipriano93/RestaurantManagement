package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import model.MenùBean;
import model.MenùBeanDAO;

class TestMBDdoDelete {
	MenùBeanDAO mbd = new MenùBeanDAO();
	int id = 2300;
	@Test
	public void doDeleteTest() {
		assertEquals(true, mbd.doDelete(id));
	}

}
