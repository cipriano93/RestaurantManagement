package testingComanda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ComandaBean;
import model.PortataComandaBean;

public class TestCBgetPortateConsegnate {
	
	@Before
	public void setUp() {
		cb = new ComandaBean();
	}
	
	
	@Test
	public void getPortateConsegnateTest() {
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setConsegnato(true);
		cb.addPortataComanda(pcb);
		portate = cb.getPortateConsegnate();
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
