package testingUtente;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import model.UtenteBean;
import model.UtenteBeanDAO;

class TestUBDdoSave {
	UtenteBean ub = new UtenteBean();
	UtenteBeanDAO ubd = new UtenteBeanDAO();
	
	@Test
	public void doSaveTest() {
		ub.setUsername("gestore97");
		ub.setPassword("gestore97");
		ub.setNome("andrea");
		ub.setCognome("cipriano");
		ub.setTipo("gestore");
		assertEquals(true, ubd.doSave(ub));
	}
	
}
