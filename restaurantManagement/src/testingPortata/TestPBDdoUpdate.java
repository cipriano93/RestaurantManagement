package testingPortata;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.PortataBean;
import model.PortataBeanDAO;

public class TestPBDdoUpdate {
	
	@Before
	public void setUp() {
		mb.setNome("Profumi");
		pb.setIdMenù(mb.getIdMenù());
		pb.setNome("Salmone");
		pb.setTipo("Secondo");
		pb.setPrezzo("8.0");
		pb.setDescrizione("Pesce");
		mbd.doSave(mb);
		pbd.doSave(pb);
	}

	@Test
	public void doUpdateTest() {
		pb.setNome("Frittura di pesce");
		pb.setPrezzo("9.00");
		pb.setTipo("Seconodo");
		pb.setDescrizione("calamari e gamberetti ");
		assertEquals(true, pbd.doUpdate(pb));
	}

	@After
	public void tearDown() {
		pbd.doDelete(pb.getIdPortata());
		mbd.doDelete(mb.getIdMenù());
	}
	
	private PortataBeanDAO pbd = new PortataBeanDAO();
	private PortataBean pb = new PortataBean();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
