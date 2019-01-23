package testingComandaManager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;

import model.ComandaBean;
import model.ComandaManager;
import model.CucinaBean;
import model.MenùBean;
import model.MenùBeanDAO;
import model.PortataBean;
import model.PortataBeanDAO;
import model.PortataComandaBean;
import model.TavoloBean;

public class TestCMinviaComanda {
	
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
		pcb.setConsegnato(true);
		pcb.setQuantità(3);
		pcb.setNote("senza aglio");
		tb.setNumeroTavolo(2);
		tb.setNumeroPersone(2);
		cb.setTavolo(tb);
	}
	
	@Test
	public void inviaComandaTest() {
		int size = c.getComande().size();
		cm.inviaComanda(c, cb);
		assertEquals(size + 1, c.getComande().size());
	}

	@After
	public void tearDown() {
		c.getComande().clear();
		cb = null;
		pbd.doDelete(pb.getIdPortata());
		mbd.doDelete(mb.getIdMenù());
	}

	@Test
	public void testForException() {
		try {
			c.getComande().get(0);
		} catch (IndexOutOfBoundsException i) {
		}
	}
	
	
	
	private MenùBean mb = new MenùBean();
	private MenùBeanDAO mbd = new MenùBeanDAO();
	private ComandaBean cb = new ComandaBean();
	private ComandaManager cm = new ComandaManager();
	private PortataComandaBean pcb = new PortataComandaBean();
	private PortataBean pb = new PortataBean();
	private PortataBeanDAO pbd = new PortataBeanDAO();
	private ArrayList<PortataComandaBean> portateComanda = new ArrayList<PortataComandaBean>();
	private CucinaBean c = new CucinaBean();
	private TavoloBean tb = new TavoloBean();
}
