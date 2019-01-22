package testingComandaManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.CucinaBean;

public class TestCMinviaComanda {

	@Test
	public void inviaComandaTest() {
		assertEquals(true, cm.inviaComanda(new CucinaBean(), new ComandaBean()));
	}
	
	
	private ComandaManager cm = new ComandaManager();
}
