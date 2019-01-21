package testingMenù;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestMBDdosave.class,
	TestMBDdoUpdate.class,
	TestMBDdoRetrieveByKey.class,
	TestMBDdoDelete.class,
	TestMBDdoRetrieveAll.class
})
public class TestSuiteMBD {

}
