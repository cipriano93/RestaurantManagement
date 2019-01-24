package testingAttivitàManager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.AttivitàBean;
import model.AttivitàManager;

public class TestAMmodificaDatiAttività {
	
	@Before
	public void setUp() {
		ab.setNome("Incontro");
		ab.setPiva("00000000000");
		ab.setProvincia("Avellino");
		ab.setCittà("Ariano Irpino");
		ab.setIndirizzo("nazionale mamma");
		ab.setNum_civ(4);
		ab.setTel("3333333333");
	}
	

	@Test
	public void modificaDatiAttivitàTest() {
		assertEquals(true, am.modificaDatiAttività(ab.getNome(), ab.getPiva(), ab.getProvincia(), ab.getCittà(), ab.getIndirizzo(), ab.getNum_civ(), ab.getTel()));
	}
	
	
	private AttivitàManager am = new AttivitàManager();
	private AttivitàBean ab = new AttivitàBean();
}
