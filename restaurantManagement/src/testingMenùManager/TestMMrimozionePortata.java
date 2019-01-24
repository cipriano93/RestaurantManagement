package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;
import model.PortataBean;
import model.PortataBeanDAO;

public class TestMMrimozionePortata {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		
		pb.setIdMenù(mb.getIdMenù());
		pb.setNome("Affettato misto");
		pb.setTipo("antipasto");
		pb.setPrezzo("2.5");
		pb.setDescrizione("i sapori del sud");
		mbd.doSave(mb);
		pbd.doSave(pb);
	}
	
	
	@Test
	public void rimozionePortataTest() {
		mm.rimozioneMenù(mb.getIdMenù());
		assertEquals(true, mm.rimozionePortata(pb.getIdPortata()));
	}

	
	private MenùManager mm = new MenùManager();
	private PortataBean pb = new PortataBean();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
