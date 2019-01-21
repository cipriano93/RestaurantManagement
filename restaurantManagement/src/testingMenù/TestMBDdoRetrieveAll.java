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
		menùs = new ArrayList<MenùBean>();
	}
	
	
	@Test
	public void doRetrieveAllTest() {
		assertEquals(true, mbd.doRetrieveAll().size() > 0);
	}
	
	
	@After
	public void tearDown() {
		menùs = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = menùs.get(0);
	}
	
	
	private ArrayList<MenùBean> menùs;
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
