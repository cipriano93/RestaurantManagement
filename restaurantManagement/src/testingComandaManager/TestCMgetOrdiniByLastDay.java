package testingComandaManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ComandaManager;
import model.OrdineBean;

public class TestCMgetOrdiniByLastDay {
	
	@Before
	public void setUp() {
		ordini = new ArrayList<>();
	}
	
	@Test
	public void getOrdiniByLastDayTest() {
		ordini = cm.getOrdiniByLastDay();
		assertEquals(true, ordini.size() > 0);
	}
	
	
	@After
	public void tearDown() {
		ordini = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = ordini.get(0);
	}
	
	
	private ComandaManager cm = new ComandaManager();
	private ArrayList<OrdineBean> ordini;
}
