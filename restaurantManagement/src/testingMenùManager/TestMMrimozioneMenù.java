package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMrimozioneMenù {
	
	@Test
	public void rimozioneMenùTest() {
		assertEquals(true, mm.rimozioneMenù(1000));
	}
	
	private MenùManager mm = new MenùManager();
}
