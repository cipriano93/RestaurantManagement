package testingComandaManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.OrdineBean;
import model.TavoloBean;

public class TestCMgetOrdini {
	
	@Before
	public void setUp() {
		tb.setNumeroPersone(10);
		tb.setNumeroTavolo(1);
		tavoli.add(tb);
		cb = cm.creaComanda(tb.getNumeroTavolo(), tb.getNumeroPersone());
	}
	
	@Test
	public void getOrdiniTest() {
		ordini = cm.getOrdini();
		size = ordini.size();
		cm.inserimentoOrdine(cb, 60);
		assertEquals(size + 1, cm.getOrdini().size());
	}
	
	@After
	public void tearDown() {
		ordini.clear();
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = ordini.get(0);
	}
	
	private ComandaBean cb = new ComandaBean();
	private TavoloBean tb = new TavoloBean();
	private ArrayList<TavoloBean> tavoli = new ArrayList<TavoloBean>();
	private ComandaManager cm = new ComandaManager();
	private ArrayList<OrdineBean> ordini = new ArrayList<OrdineBean>();
	private int size;
}
