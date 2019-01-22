package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.TavoloBean;

public class TestCMinserimentoOrdine {

	@Test
	public void inserimentoOrdineTest() {
		TavoloBean tb = new TavoloBean();
		tb.setNumeroPersone(10);
		
		ComandaBean cb = new ComandaBean();
		cb.setTavolo(tb);
		
		assertEquals(true, cm.inserimentoOrdine(cb, 100));
	}
	
	
	private ComandaManager cm = new ComandaManager();
}
