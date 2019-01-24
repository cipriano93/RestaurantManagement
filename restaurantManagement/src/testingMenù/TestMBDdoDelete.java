package testingMenù;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

public class TestMBDdoDelete {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		mbd.doSave(mb);
	}
	
	
	@Test
	public void doDeleteTest() {
		assertEquals(true, mbd.doDelete(mb.getIdMenù()));
	}
	
	
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private MenùBean mb = new MenùBean();
}
