package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.PortataBean;
import model.PortataComandaBean;

public class TestCMmodificaPortataComandaQuantity {

	@Test
	public void modificaPortataComandaQuantityTest() {
		PortataBean pb = new PortataBean();
		pb.setIdPortata(1000);
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setPb(pb);
		ComandaBean cb = new ComandaBean();
		cb.addPortataComanda(pcb);
		assertEquals(true, cm.modificaPortataComandaQuantity(cb, pb.getIdPortata(), 10));
	}
	
	
	private ComandaManager cm = new ComandaManager();
}
