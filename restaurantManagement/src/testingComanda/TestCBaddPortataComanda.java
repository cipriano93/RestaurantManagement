package testingComanda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.PortataComandaBean;

public class TestCBaddPortataComanda {
	
	@Test
	public void addPortataComandaTest() {
		assertEquals(true, cb.addPortataComanda(new PortataComandaBean()));
	}
	
	
	private ComandaBean cb = new ComandaBean();
}
