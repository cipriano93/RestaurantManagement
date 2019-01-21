package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.MenùManager;

public class TestMMrimozionePortata {
	
	@Test
	public void rimozionePortataTest() {
		assertEquals(true, mm.rimozionePortata(1000));
	}

	private MenùManager mm = new MenùManager();
}
