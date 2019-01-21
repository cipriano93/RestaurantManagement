package testingPortata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.PortataBean;
import model.PortataBeanDAO;

public class TestPBDdoRetrieveByCond {
	
	@Before
	public void setUp() {
		portate = new ArrayList<PortataBean>();
	}
	
	
	@Test
	public void doRetrieveByCondTest() {
		assertEquals(true, pbd.doRetrieveByCond(1000).size() > 0);
	}
	
	
	@After
	public void tearDown() {
		portate = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = portate.get(0);
	}
	
	
	private ArrayList<PortataBean> portate;
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
