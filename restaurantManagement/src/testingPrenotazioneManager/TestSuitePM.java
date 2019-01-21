package testingPrenotazioneManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testingUtenteManager.TestUMlogin;
import testingUtenteManager.TestUMregistrazione;
import testingUtenteManager.TestUMmodificaDatiPersonali;

@RunWith(Suite.class)
@SuiteClasses({
	TestUMlogin.class,
	TestUMregistrazione.class,
	TestUMmodificaDatiPersonali.class
})

public class TestSuitePM {

}
