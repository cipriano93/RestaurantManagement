package testingPortata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.PortataBean;
import model.PortataBeanDAO;

public class TestPBDdoUpdate {
	
	@Test
	public void doUpdateTest() {
		pb.setIdPortata(1000);
		pb.setNome("portata1");
		pb.setPrezzo("3.00");
		pb.setTipo("primo");
		pb.setDescrizione("descrizione1");
		assertEquals(true, pbd.doUpdate(pb));
	}
	
	
	private PortataBean pb = new PortataBean();
	private PortataBeanDAO pbd = new PortataBeanDAO();
}
