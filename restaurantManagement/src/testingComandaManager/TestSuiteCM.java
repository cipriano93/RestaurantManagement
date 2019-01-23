package testingComandaManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestCMaggiornaListaTavoli.class,
	TestCMgetOrdini.class,
	TestCMgetOrdiniByLastDay.class,
	TestCMgetOrdiniByLastMonth.class,
	TestCMgetOrdiniByLastYear.class,
	TestCMinviaComanda.class,
	TestCMcreaComanda.class,
	TestCMinserimentoOrdine.class,
	TestCMinserimentoPortataComanda.class,
	TestCMmodificaPortataComandaQuantity.class,
	TestCMmodificaPortataComandaStato.class,
	TestCMrimozionePortataComanda.class
})

public class TestSuiteCM {

}
