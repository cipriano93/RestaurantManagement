package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

public class TestMBDdoUpdate {

	@Before
	public void setUp() {
		mb.setNome("Sapori della campagna");
	}
	
	
	@Test
	public void doUpdateTest() {
		mb.setNome("San valentino");
		assertEquals(true, mbd.doUpdate(mb));
	}
	
	
	@After
	public void tearDown() {
		mbd.doDelete(mb.getIdMenù());
	}
	
	
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
