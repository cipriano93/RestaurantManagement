package testingMenù;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestMBDdoSave.class,
	TestMBDdoDelete.class,
	TestMBDdoRetrieveByKey.class,
	TestMBDdoUpdate.class,
	TestMBDdoRetrieveAll.class
})
public class TestSuiteMBD {
	
}
