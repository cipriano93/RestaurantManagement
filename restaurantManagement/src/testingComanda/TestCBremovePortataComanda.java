package testingComanda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.PortataComandaBean;

public class TestCBremovePortataComanda {
	
	@Test
	public void removePortataComandaTest() {
		PortataComandaBean pcb = new PortataComandaBean();
		cb.addPortataComanda(pcb);
		assertEquals(true, cb.removePortataComanda(pcb));
	}
	
	
	private ComandaBean cb = new ComandaBean();
}
