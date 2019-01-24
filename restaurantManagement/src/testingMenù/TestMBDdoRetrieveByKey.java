package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

public class TestMBDdoRetrieveByKey {

	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		mbd.doSave(mb);
	}
	
	
	@Test
	public void doRetrieveByKeyTest() {
		assertEquals(mb.getIdMenù(), mbd.doRetrieveByKey(mb.getIdMenù()).getIdMenù());
	}
	
	
	@After
	public void tearDown() {
		mbd.doDelete(mb.getIdMenù());
	}
	
	
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
