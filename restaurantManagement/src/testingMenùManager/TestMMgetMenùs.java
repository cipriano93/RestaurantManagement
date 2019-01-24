package testingMenùManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;
import model.PrenotazioneBean;

public class TestMMgetMenùs {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		size = mm.getMenùs().size();
		mbd.doSave(mb);
	}
	
	@Test
	public void getMenùsTest() {
		menu = mm.getMenùs();
		assertEquals(size+1, menu.size());
	}
	
	
	@After
	public void tearDown() {
		menu.clear();
		mm.rimozioneMenù(mb.getIdMenù());
	}
	
	
	@Test
	public void testForException() {
		try {
			Object o = menu.get(0);
		} catch (IndexOutOfBoundsException i) { }
	}
	
	
	private ArrayList<MenùBean> menu = new ArrayList<>();
	private MenùManager mm = new MenùManager();
	private int size;
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
