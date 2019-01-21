package testingMenùManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùManager;
import model.PortataBean;
import model.PrenotazioneManager;

public class TestMMgetPortateByMenuTipo {
	
	@Before
	public void setUp() {
		portate = new ArrayList<PortataBean>();
	}
	
	@Test
	public void getPortateByMenuTipoTest() {
		portate = mm.getPortateByMenuTipo(65585,"Secondo");
		assertEquals(true, mm.getPortateByMenuTipo(65585,"Secondo").size() > 0);
	}
	
	
	@After
	public void tearDown() {
		portate = null;
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = portate.get(0);
	}
	
	
	private ArrayList<PortataBean> portate;
	private MenùManager mm = new MenùManager();
}
