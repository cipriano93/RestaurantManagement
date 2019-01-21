package testingMenùManager;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùManager;
import model.PortataBean;

public class TestMMgetPortate {
	
	@Before
	public void setUp() {
		portate = new ArrayList<PortataBean>();
	}
	
	@Test
	public void getPortateTest() {
		portate = mm.getPortate(65585);
		assertEquals(true, mm.getPortate(65585).size() > 0);
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
	private MenùManager mm = new MenùManager();
}
