package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMinserimentoMenù {
	
	@Test
	public void prenotaTavoloTest() {
		assertEquals(true, mm.inserimentoMenù("menù"));
	}
	
	
	private MenùManager mm = new MenùManager();
}
