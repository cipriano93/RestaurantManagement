package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.TavoloBean;

public class TestCMcreaComanda {
	@Before
	public void setUp() {
		tb.setNumeroPersone(10);
		tb.setNumeroTavolo(1);
	}
	
	@Test
	public void creaComandaTest() {
		ComandaBean cb = cm.creaComanda(tb.getNumeroTavolo(), tb.getNumeroPersone());
		assertEquals(tb.getNumeroTavolo(), cb.getTavolo().getNumeroTavolo());
	}
	
	@After
	public void tearDown() {
		cb = null;
	}
	
	private ComandaBean cb = new ComandaBean();
	private ComandaManager cm = new ComandaManager();
	private TavoloBean tb = new TavoloBean();
	
}
