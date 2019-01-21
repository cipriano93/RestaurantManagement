package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMmodificaNomeMenù {
	
	@Test
	public void modificaNomeMenùTest() {
		assertEquals(true, mm.modificaNomeMenù(55442, "Sapori dell'Irpinia"));
	}
	
	private MenùManager mm = new MenùManager();
}
