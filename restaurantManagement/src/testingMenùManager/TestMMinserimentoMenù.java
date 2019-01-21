package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMinserimentoMenù {
	
	@Test
	public void inserimentoMenùTest() {
		assertEquals(true, mm.inserimentoMenù("bell'italia"));
	}
	
	
	private MenùManager mm = new MenùManager();
}
