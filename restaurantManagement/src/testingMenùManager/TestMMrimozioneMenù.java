package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;

public class TestMMrimozioneMenù {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		mbd.doSave(mb);
	}
	
	
	@Test
	public void rimozioneMenùTest() {
		assertEquals(true, mm.rimozioneMenù(mb.getIdMenù()));
	}
	
	
	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
