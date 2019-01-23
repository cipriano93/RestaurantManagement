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
		tb.setNumeroPersone(10);
		tb.setNumeroTavolo(1);
		tavoli.add(tb);
	}
	
	@Test
	public void aggiornaListaTavoliTest() {
		tavoli = cm.aggiornaListaTavoli(tavoli, tb.getNumeroTavolo(), tb.getNumeroPersone());
		assertEquals(tb.getNumeroPersone(), tavoli.get(tb.getNumeroTavolo()-1).getNumeroPersone());
	}
	
	@After
	public void tearDown() {
		tavoli.get(tb.getNumeroTavolo()-1).setNumeroPersone(0);
		
	}
	
	private TavoloBean tb = new TavoloBean();
	private ArrayList<TavoloBean> tavoli = new ArrayList<TavoloBean>();
	private ComandaManager cm = new ComandaManager();
}
