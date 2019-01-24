package testingMenù;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;

public class TestMBDdoRetrieveAll {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		mbd.doSave(mb);
	}
	
	
	@Test
	public void doRetrieveAllTest() {
		menùs = mbd.doRetrieveAll();
		assertEquals(1, menùs.size());
	}
	
	
	@After
	public void tearDown() {
		menùs.clear();
		mbd.doDelete(mb.getIdMenù());
	}
	
	
	@Test
	public void testForException() {
		try {
			Object o = menùs.get(0);
		} catch (IndexOutOfBoundsException i) { }
	}
	
	
	private ArrayList<MenùBean> menùs = new ArrayList<>();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private MenùBean mb = new MenùBean();
}
