package testingMenùManager;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testingUtente.TestSuiteUBD;

public class TestRunnerMM {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuiteMM.class);

	    for (Failure failure : result.getFailures()) {
	    	System.out.println(failure.toString());
	    }

	    System.out.println(result.wasSuccessful());
	}

}
