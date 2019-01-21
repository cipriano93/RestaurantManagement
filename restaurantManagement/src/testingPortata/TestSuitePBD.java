package testingPortata;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestPBDdoSave.class,
	TestPBDdoDelete.class,
	TestPBDdoRetrieveByKey.class,
	TestPBDdoRetrieveByCond.class,
	TestPBDdoUpdate.class,
	TestPBDgetIdByNome.class
})
public class TestSuitePBD {
	
}
