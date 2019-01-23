package testingComanda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ComandaBean;
import model.PortataComandaBean;

public class TestCBgetPortateComanda {
	
	@Before
	public void setUp() {
		cb = new ComandaBean();
	}
	
	
	@Test
	public void getPortateComandaTest() {
		PortataComandaBean pcb = new PortataComandaBean();
		cb.addPortataComanda(pcb);
		portate = cb.getPortateComanda();
		assertEquals(true, portate.size() > 0);
	}
	
	
	@After
	public void tearDown() {
		cb = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = cb.getPortateConsegnate().get(0);
	}
	
	
	private ArrayList<PortataComandaBean> portate;
	private ComandaBean cb;
}
