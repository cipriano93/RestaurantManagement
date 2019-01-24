package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;

public class TestMMgetIdMenuByNome {
	
	@Before
	public void setUp() {
		mb.setNome("Stella di mare");
		
		mbd.doSave(mb);
	}
	
	
	@Test
	public void getIdMenuByNomeTest() {
		assertEquals(mb.getIdMenù(), mm.getIdMenuByNome(mb.getNome()));
	}
	
	
	@After
	public void tearDown() {
		mm.rimozioneMenù(mb.getIdMenù());
	}
	
	
	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
