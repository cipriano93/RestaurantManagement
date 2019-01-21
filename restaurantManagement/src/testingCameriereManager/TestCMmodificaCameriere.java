package testingCameriereManager;

import static org.junit.Assert.*;

import org.junit.Test;

import model.CameriereManager;

public class TestCMmodificaCameriere {

	@Test
	public void modificaCameriereTest() {
		assertEquals(true, cm.modificaCameriere("cameriere00", "cameriere00", "Filippo", "Sudrio", "cameriere"));
	}
	private CameriereManager cm = new CameriereManager();

}
