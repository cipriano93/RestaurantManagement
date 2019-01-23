package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.PortataBean;
import model.PortataComandaBean;

public class TestCMmodificaPortataComandaStato {

	@Test
	public void modificaPortataComandaStatoTest() {
		PortataBean pb = new PortataBean();
		pb.setIdPortata(1000);
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setPb(pb);
		ComandaBean cb = new ComandaBean();
		cb.addPortataComanda(pcb);
		assertEquals(true, cm.modificaPortataComandaStato(cb, 2000, true));
	}
	
	
	private ComandaManager cm = new ComandaManager();
}
