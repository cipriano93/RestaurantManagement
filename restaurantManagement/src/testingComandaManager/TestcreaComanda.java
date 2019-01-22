package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.TavoloBean;

public class TestcreaComanda {

	@Test
	public void creaComandaTest() {
		TavoloBean tb = new TavoloBean();
		tb.setNumeroPersone(10);
		tb.setNumeroTavolo(1);
		
		ComandaBean cb = cm.creaComanda(1, 10);
		assertEquals(true, (cb.getTavolo().getNumeroPersone()) == (tb.getNumeroPersone()) && 
				(cb.getTavolo().getNumeroTavolo()) == (tb.getNumeroTavolo()));
	}
	
	
	private ComandaManager cm = new ComandaManager();
}
