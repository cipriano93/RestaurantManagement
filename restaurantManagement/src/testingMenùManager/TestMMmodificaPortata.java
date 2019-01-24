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

public class TestMMmodificaPortata {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		
		mbd.doSave(mb);
		
		pb.setIdMenù(mb.getIdMenù());
		pb.setNome("Affettato misto");
		pb.setTipo("antipasto");
		pb.setPrezzo("2.5");
		pb.setDescrizione("i sapori del sud");
		
		pbd.doSave(pb);
	}
	
	
	@Test
	public void modificaPortataTest() {
		pb.setNome("Casereccio");
		pb.setTipo("Antipasto");
		pb.setPrezzo("3.00");
		pb.setDescrizione("profumi dell'irpinia");
		
		assertEquals(true, mm.modificaPortata(pb.getIdPortata(), pb.getNome(), pb.getTipo(), pb.getPrezzo(), pb.getDescrizione()));
	}
	
	
	@After
	public void tearDown() {
		mm.rimozionePortata(pb.getIdPortata());
		mm.rimozioneMenù(mb.getIdMenù());
	}
	

	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private PortataBean pb = new PortataBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
