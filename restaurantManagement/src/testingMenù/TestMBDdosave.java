package testingMenù;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.MenùBean;
import model.MenùBeanDAO;

class TestMBDdosave {
	MenùBean mb = new MenùBean();
	MenùBeanDAO mbd = new MenùBeanDAO();
	@Test
	public void doSaveTest() {
		mb.setIdMenù(2300);
		mb.setNome("Stelle di mare");
		assertEquals(true, mbd.doSave(mb));
	}

}
