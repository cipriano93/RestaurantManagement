package testingMenùManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestMMgetIdMenuByNome.class,
	TestMMgetMenùs.class,
	TestMMgetPortataByNome.class, 
	TestMMgetPortate.class,
	TestMMgetPortateByMenuTipo.class,
	TestMMinserimentoMenù.class,
	TestMMinserimentoPortata.class,
	TestMMmodificaNomeMenù.class, 
	TestMMmodificaPortata.class,
	TestMMrimozioneMenù.class,
	TestMMrimozionePortata.class })
public class TestSuiteMM {

}
