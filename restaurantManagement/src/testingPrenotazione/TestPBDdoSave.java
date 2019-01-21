package testingPrenotazione;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import model.PrenotazioneBean;
import model.PrenotazioneBeanDAO;

public class TestPBDdoSave {
	
	@Test
	public void doSaveTest() {
		pb.setIdPrenotazione(1000);
		pb.setData(new GregorianCalendar());
		pb.setNumPersone(10);
		pb.setTelefono("0123456789");
		pb.setDescrizione("descrizione");
		assertEquals(true, pbd.doSave(pb, "cliente"));
	}
	
	
	private PrenotazioneBean pb = new PrenotazioneBean();
	private PrenotazioneBeanDAO pbd = new PrenotazioneBeanDAO();
}
