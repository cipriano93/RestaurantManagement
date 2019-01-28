package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;

public class TestMMinserimentoMenù {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
	}
	
	
	@Test
	public void inserimentoMenùTest() {
		assertEquals(true, mm.inserimentoMenù(mb.getNome()));
	}
	
	@After
	public void tearDown() {
		mbd.doDelete(mbd.getIdByNome(mb.getNome()).getIdMenù());
	}
	
	
	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
