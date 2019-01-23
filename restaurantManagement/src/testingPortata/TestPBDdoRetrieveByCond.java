package testingPortata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.MenùBean;
import model.MenùBeanDAO;
import model.PortataBean;
import model.PortataBeanDAO;

public class TestPBDdoRetrieveByCond {
	
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
	public void doRetrieveByCondTest() {
		assertEquals(1, pbd.doRetrieveByCond(mb.getIdMenù()).size());
	}
	
	@After
	public void tearDown() {
		portate.clear();
		pbd.doDelete(pb.getIdPortata());
		mbd.doDelete(mb.getIdMenù());
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = portate.get(0);
	}
	
	
	private ArrayList<PortataBean> portate = new ArrayList<PortataBean>();
	private PortataBeanDAO pbd = new PortataBeanDAO();
	private PortataBean pb = new PortataBean();
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
}
