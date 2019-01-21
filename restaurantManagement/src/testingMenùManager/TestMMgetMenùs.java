package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMgetMenùs {
	
	@Test
	public void prenotaTavoloTest() {
		assertEquals(true, mm.getMenùs());
	}
	
	
	private MenùManager mm = new MenùManager();
}
