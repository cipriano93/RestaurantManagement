package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;

public class TestMMmodificaNomeMenù {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		mbd.doSave(mb);
	}
	
	
	@Test
	public void modificaNomeMenùTest() {
		mb.setNome("Sapori dell'Irpinia");
		assertEquals(true, mm.modificaNomeMenù(mb.getIdMenù(), mb.getNome()));
	}
	
	
	@After
	public void tearDown() {
		mm.rimozioneMenù(mb.getIdMenù());
	}
	
	
	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
