package testingOrdine;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import model.OrdineBean;
import model.OrdineBeanDAO;

public class TestOBDdoSave {
	
	@Test
	public void doSaveTest() {
		ob.setIdOrdine(1000);
		ob.setData(new GregorianCalendar());
		ob.setNumCoperti(10);
		ob.setTotale(100);
		assertEquals(true, obd.doSave(ob));
	}
	
	
	private OrdineBean ob = new OrdineBean();
	private OrdineBeanDAO obd = new OrdineBeanDAO();
}
