package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

public class TestMBDdoSave {

	@Before
	public void setUp() {
		mb.setNome("menu");
	}
	
	
	@Test
	public void doSaveTest() {
		assertEquals(true, mbd.doSave(mb));
	}
	
	
	@After
	public void tearDown() {
		mbd.doDelete(mb.getIdMenù());
	}
	
	
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
