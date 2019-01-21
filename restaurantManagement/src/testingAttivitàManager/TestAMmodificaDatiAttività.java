package testingAttivitàManager;

import static org.junit.Assert.*;

import org.junit.Test;

import model.AttivitàManager;

public class TestAMmodificaDatiAttività {

	@Test
	public void modificaDatiAttivitàTest() {
		assertEquals(true, am.modificaDatiAttività("Incontro", "00000000000", "Avellino", "Ariano Irpino", "nazionale mamma", 4, "3333333333"));
	}
	
	private AttivitàManager am = new AttivitàManager();

}
