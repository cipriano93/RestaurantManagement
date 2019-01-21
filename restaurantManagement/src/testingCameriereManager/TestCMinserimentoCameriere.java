package testingCameriereManager;

import static org.junit.Assert.*;

import org.junit.Test;

import model.CameriereManager;

public class TestCMinserimentoCameriere {

	@Test
	public void inserimentoCameriereTest() {
		assertEquals(true, cm.inserimentoCameriere("cameriere00", "cameriere00", "Filippo", "Scala", "cameriere"));
	}
	private CameriereManager cm = new CameriereManager();

}
