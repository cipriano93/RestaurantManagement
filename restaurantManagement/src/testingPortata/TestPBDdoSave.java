package testingPortata;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.PortataBean;
import model.PortataBeanDAO;

public class TestPBDdoSave {
	
	@Before
	public void setUp() {
		mb.setNome("Profumi");
		pb.setIdMenù(mb.getIdMenù());
		pb.setNome("dddd");
		pb.setTipo("Secondo");
		pb.setPrezzo("8.0");
		pb.setDescrizione("Pesce");
		mbd.doSave(mb);
	}
	
	@Test
	public void doSaveTest() {
		assertEquals(true, pbd.doSave(pb));
	}
	
	@After
	public void tearDown() {
		pbd.doDelete(pb.getIdPortata());
		mbd.doDelete(mb.getIdMenù());
	}

	private PortataBean pb = new PortataBean();
	private PortataBeanDAO pbd = new PortataBeanDAO();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
