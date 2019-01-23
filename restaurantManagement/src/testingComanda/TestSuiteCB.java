package testingComanda;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCBremovePortataComanda.class,
	TestCBaddPortataComanda.class,
	TestCBgetSizeAllPortate.class,
	TestCBgetPortateComanda.class,
	TestCBgetPortateConsegnate.class,
	TestCBgetPortateNonConsegnate.class
})

public class TestSuiteCB {
	
}
