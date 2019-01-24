package testingOrdine;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.OrdineBean;
import model.OrdineBeanDAO;

public class TestOBDdoSave {

	@Before	
	public void setUp() {
		double tot = 45;
		ob.setData(new GregorianCalendar());
		ob.setNumCoperti(10);
		ob.setTotale(tot);
	}
	
	
	@Test
	public void doSaveTest() {
		
		assertEquals(true, obd.doSave(ob));
	}
	
	@After
	public void tearDown() {
		obd.doDelete(ob.getIdOrdine());
	}

	
	private OrdineBean ob = new OrdineBean();
	private OrdineBeanDAO obd = new OrdineBeanDAO();
}
