package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

public class TestMBDdoSave {
	
	@Test
	public void doSaveTest() {
		mb.setIdMenù(1000);
		mb.setNome("menu");
		assertEquals(true, mbd.doSave(mb));
	}
	
	
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
