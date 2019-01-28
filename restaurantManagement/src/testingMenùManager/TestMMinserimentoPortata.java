package testingMenùManager;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.MenùManager;
import model.PortataBean;

public class TestMMinserimentoPortata {
	
	@Before
	public void setUp() {
		mb.setNome("bell'italia");
		
		mbd.doSave(mb);
		
		pb.setNome("Carciofi marinati");
		pb.setTipo("Antipasto");
		pb.setPrezzo("2.5");
		pb.setDescrizione("i sapori del sud");
	}
	
	
	@Test
	public void inserimentoPortataTest() {
		assertEquals(true, mm.inserimentoPortata(mb.getIdMenù(), pb.getNome(), pb.getTipo(), pb.getPrezzo(), pb.getDescrizione()));
	}
	
	
	@After
	public void tearDown() {
		mm.rimozioneMenù(mb.getIdMenù());
	}
	

	private MenùManager mm = new MenùManager();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private PortataBean pb = new PortataBean();
}
