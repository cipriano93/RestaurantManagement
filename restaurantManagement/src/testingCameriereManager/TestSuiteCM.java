package testingCameriereManager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestCMinserimentoCameriere.class, 
	TestCMmodificaCameriere.class, 
	TestCMrimozioneCameriere.class })
public class TestSuiteCM {

}
