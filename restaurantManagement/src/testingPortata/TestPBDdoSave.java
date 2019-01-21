package testingPortata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.PortataBean;
import model.PortataBeanDAO;

public class TestPBDdoSave {
	
	@Test
	public void doSaveTest() {
		pb.setIdPortata(1000);
		pb.setIdMenù(1000);
		pb.setNome("portata");
		pb.setTipo("antipasto");
		pb.setPrezzo("2.50");
		pb.setDescrizione("descrizione");
		assertEquals(true, pbd.doSave(pb));
	}
	
	
	private PortataBean pb = new PortataBean();
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
