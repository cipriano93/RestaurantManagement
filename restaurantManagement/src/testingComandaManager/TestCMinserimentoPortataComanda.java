package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.PortataBean;
import model.PortataComandaBean;

public class TestCMinserimentoPortataComanda {

	@Test
	public void inserimentoPortataComandaTest() {
		PortataBean pb = new PortataBean();
		pb.setIdPortata(1000);
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setPb(pb);
		ComandaBean cb = new ComandaBean();
		cb.addPortataComanda(pcb);
		cb.addPortataComanda(pcb);
		assertEquals(true, cm.inserimentoPortataComanda(cb, pb, 10, "note"));
	}
	
	
	private ComandaManager cm = new ComandaManager();
}
