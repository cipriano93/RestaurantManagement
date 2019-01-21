package testingMenùManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùManager;
import model.PortataBean;
import model.PrenotazioneManager;

public class TestMMgetPortataByNome {
	
	@Test
	public void getPortateTest() {
		assertEquals("Scialatelli frutti di mare", mm.getPortataByNome("Scialatelli frutti di mare").getNome());
	}

	private MenùManager mm = new MenùManager();
}