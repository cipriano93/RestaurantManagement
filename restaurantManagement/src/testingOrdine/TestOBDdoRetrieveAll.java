package testingOrdine;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.OrdineBean;
import model.OrdineBeanDAO;

public class TestOBDdoRetrieveAll {
	
	@Before
	public void setUp() {
		double tot = 45;
		ob = new OrdineBean();
		ob.setData(new GregorianCalendar());
		ob.setNumCoperti(10);
		ob.setTotale(tot);
		
		size = obd.doRetrieveAll().size();
		
		obd.doSave(ob);
	}
	
	
	@Test
	public void doRetrieveAllTest() {
		ordini = obd.doRetrieveAll();
		assertEquals(size + 1, ordini.size());
	}
	
	
	@After
	public void tearDown() {
		ordini.clear();
		obd.doDelete(ob.getIdOrdine());
	}
	
	
	@Test
	public void testForException() {
		try {
			Object o = ordini.get(0);
		} catch (IndexOutOfBoundsException i) {
			
		}
	}
	
	
	private ArrayList<OrdineBean> ordini = new ArrayList<>();
	private OrdineBeanDAO obd = new OrdineBeanDAO();
	private OrdineBean ob;
	private int size;
}
