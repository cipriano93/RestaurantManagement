package testingMenùManager;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;
import model.PortataBean;
import model.PortataBeanDAO;

public class TestMMgetPortate {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		mbd.doSave(mb);
		
		pb.setIdMenù(mb.getIdMenù());
		pb.setNome("Scialatielli frutti di mare");
		pb.setTipo("primo");
		pb.setPrezzo("2.5");
		pb.setDescrizione("i sapori del sud");
		
		pbd.doSave(pb);
	}
	
	@Test
	public void getPortateTest() {
		portate = mm.getPortate(mb.getIdMenù());
		assertEquals(1, portate.size());
	}
	
	
	@After
	public void tearDown() {
		portate.clear();
		mm.rimozionePortata(pb.getIdPortata());
		mm.rimozioneMenù(mb.getIdMenù());
	}
	
	
	@Test
	public void testForException() {
		try {
			Object o = portate.get(0);
		} catch (IndexOutOfBoundsException i) { }
	}
	
	
	private ArrayList<PortataBean> portate = new ArrayList<>();
	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private PortataBean pb = new PortataBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
