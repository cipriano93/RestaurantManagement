package testingPrenotazione;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestPBDdoSave.class,
	TestPBDdoRetrieveAll.class,
	TestPBDdoRetrieveAllByKey.class,
	TestMBDdoDelete.class
})
public class TestSuitePBD {
	
}
