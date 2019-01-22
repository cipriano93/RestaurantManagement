package testingComandaManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ComandaManager;
import model.TavoloBean;

public class TestCMaggiornaListaTavoli {

	@Before
	public void setUp() {
		tavoli = new ArrayList<TavoloBean>();
		tb.setNumeroPersone(10);
		tb.setNumeroTavolo(1);
	}
	
	@Test
	public void aggiornaListaTavoliTest() {
		ArrayList<TavoloBean> tavoli = new ArrayList<>();
		tavoli.add(tb);
		this.tavoli = cm.aggiornaListaTavoli(tavoli, 1, 10);
		assertEquals(true, tavoli.size() > 0);
	}
	
	
	@After
	public void tearDown() {
		tavoli = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = tavoli.get(0);
	}
	
	
	private TavoloBean tb = new TavoloBean();
	private ArrayList<TavoloBean> tavoli;
	private ComandaManager cm = new ComandaManager();
}
