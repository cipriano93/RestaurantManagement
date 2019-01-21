package testingOrdine;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestOBDdoSave.class,
	TestOBDdoRetrieveByDay.class,
	TestOBDdoRetrieveByMonth.class,
	TestOBDdoRetrieveByYear.class,
	TestOBDdoRetrieveAll.class
})
public class TestSuiteOBD {
	
}
