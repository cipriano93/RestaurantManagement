package testingOrdine;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.OrdineBean;
import model.OrdineBeanDAO;

public class TestOBDdoRetrieveByYear {
	
	@Before
	public void setUp() {
		ordini = new ArrayList<OrdineBean>();
	}
	
	
	@Test
	public void doRetrieveByYearTest() {
		assertEquals(true, obd.doRetrieveAll().size() > 0);
	}
	
	
	@After
	public void tearDown() {
		ordini = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = ordini.get(0);
	}
	
	
	private ArrayList<OrdineBean> ordini;
	private OrdineBeanDAO obd = new OrdineBeanDAO();
}
