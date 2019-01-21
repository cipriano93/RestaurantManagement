package testingMenù;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

class TestMBDdoUpdate {
	MenùBean mb = new MenùBean();
	MenùBeanDAO mbd = new MenùBeanDAO();
	int id = 2300;
	@Test
	public void doUpdateTest() {
		mb.setIdMenù(id);
		mb.setNome("Stelle");
		assertEquals(true, mbd.doUpdate(mb));
	}

}
