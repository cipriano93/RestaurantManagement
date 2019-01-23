package testingComanda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.ComandaBean;
import model.MenùBean;
import model.MenùBeanDAO;
import model.PortataBean;
import model.PortataBeanDAO;
import model.PortataComandaBean;

public class TestCBgetPortateNonConsegnate {
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
		pcb.setPb(pb);
		pcb.setConsegnato(false);
		pcb.setQuantità(3);
		pcb.setNote("senza aglio");
	}
	
	@Test
	public void getPortateNonConsegnateTest() {
		cb.addPortataComanda(pcb);
		portateComanda = cb.getPortateNonConsegnate();
		assertEquals(1, portateComanda.size());
	}
	
	
	@After
	public void tearDown() {
		portateComanda.clear();
		pbd.doDelete(pb.getIdPortata());
		mbd.doDelete(mb.getIdMenù());
	}
	
	@Test
	public void testForException() {
		try {
			Object o = portateComanda.get(0);
		} catch (IndexOutOfBoundsException i) {
		}
	}
	
	
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private ComandaBean cb = new ComandaBean();
	private PortataComandaBean pcb = new PortataComandaBean();
	private PortataBean pb = new PortataBean();
	private PortataBeanDAO pbd = new PortataBeanDAO();
	private ArrayList<PortataComandaBean> portateComanda = new ArrayList<PortataComandaBean>();
}
