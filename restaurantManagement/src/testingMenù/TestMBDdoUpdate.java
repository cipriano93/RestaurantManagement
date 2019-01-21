package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

public class TestMBDdoUpdate {
	
	@Test
	public void doUpdateTest() {
		mb.setIdMenù(1000);
		mb.setNome("menu1");
		assertEquals(true, mbd.doUpdate(mb));
	}
	
	
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
