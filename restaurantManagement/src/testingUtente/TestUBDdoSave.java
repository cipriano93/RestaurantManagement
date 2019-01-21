package testingUtente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
