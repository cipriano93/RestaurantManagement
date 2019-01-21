package testingUtente;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestUBDdoSave.class,
	TestUBDdoDelete.class,
	TestUBDdoRetrieveByKey.class,
	TestUBDdoRetrieveByOneKey.class,
	TestUBDdoUpdate.class
})
public class TestSuiteUBD {
	
}
