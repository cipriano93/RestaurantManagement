package testingCameriereManager;

import static org.junit.Assert.*;

import org.junit.Test;

import model.CameriereManager;

public class TestCMrimozioneCameriere {

	@Test
	public void rimozioneCameriereTest() {
		assertEquals(true, cm.rimozioneCameriere("cameriere00"));
	}
	private CameriereManager cm = new CameriereManager();
}
