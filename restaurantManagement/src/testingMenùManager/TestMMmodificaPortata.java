package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMmodificaPortata {
	
	@Test
	public void modificaPortataTest() {
		assertEquals(true, mm.modificaPortata(37492, "Casereccio", "Antipasto", "3.00", "profumi dell'irpinia"));
	}

	private MenùManager mm = new MenùManager();
}
