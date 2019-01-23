package testingComanda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.PortataComandaBean;

public class TestCBgetSizeAllPortate {
	
	@Test
	public void doRetrieveByKeyTest() {
		cb.addPortataComanda(new PortataComandaBean());
		assertEquals(1, cb.getSizeAllPortate());
	}
	
	
	private ComandaBean cb = new ComandaBean();
}
