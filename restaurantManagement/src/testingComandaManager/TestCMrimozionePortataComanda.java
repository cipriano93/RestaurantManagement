package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.PortataBean;
import model.PortataComandaBean;

public class TestCMrimozionePortataComanda {

	@Test
	public void rimozionePortataComandaTest() {
		PortataBean pb = new PortataBean();
		pb.setIdPortata(1000);
		PortataComandaBean pcb = new PortataComandaBean();
		pcb.setPb(pb);
		ComandaBean cb = new ComandaBean();
		cb.addPortataComanda(pcb);
		cb.addPortataComanda(pcb);
		assertEquals(true, cm.rimozionePortataComanda(cb, pb.getIdPortata()));
	}
	
	
	private ComandaManager cm = new ComandaManager();
}
