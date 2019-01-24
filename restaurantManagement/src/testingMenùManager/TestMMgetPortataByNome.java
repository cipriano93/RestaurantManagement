package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;
import model.PortataBean;
import model.PortataBeanDAO;

public class TestMMgetPortataByNome {
	
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
	public void getPortataByNomeTest() {
		assertEquals(pb.getNome(), mm.getPortataByNome("Scialatielli frutti di mare").getNome());
	}
	
	
	@After
	public void tearDown() {
		mm.rimozionePortata(pb.getIdPortata());
		mm.rimozioneMenù(mb.getIdMenù());
	}
	

	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private PortataBean pb = new PortataBean();
	private PortataBeanDAO pbd = new PortataBeanDAO();
}