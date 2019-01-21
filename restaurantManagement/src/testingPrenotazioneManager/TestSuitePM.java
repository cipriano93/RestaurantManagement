package testingPrenotazioneManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testingUtenteManager.TestUMlogin;
import testingUtenteManager.TestUMregistrazione;
import testingUtenteManager.TestUMmodificaDatiPersonali;

@RunWith(Suite.class)
@SuiteClasses({
	TestPMprenotaTavolo.class,
	TestPMrimozionePrenotazione.class,
	TestPMvisualizzaPrenotazioni.class
})

public class TestSuitePM {

}
