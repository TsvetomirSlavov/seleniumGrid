package com.testng.utils;

import java.util.Iterator;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	/**
	 * If you have implemented a RetryListener for your WebDriver 2.0 Test
	 * Suites, then you will have noticed that the default report under
	 * test-output from TestNG counts all tests attempts which might not be what
	 * you want to report. Said another way – if you have 10 tests and 1 fails 3
	 * times, you would expect to have a report that says of 10 tests 9 tests
	 * passed and 1 test failed, however, this is not what you will get –
	 * instead your report will show that out of 12 tests 9 tests passed and 3
	 * failed – which is incorrect.
	 */
	public void onFinish(ITestContext context) {
		Iterator<ITestResult> listOfFailedTests = context.getFailedTests()
				.getAllResults().iterator();
		while (listOfFailedTests.hasNext()) {
			ITestResult failedTest = listOfFailedTests.next();
			ITestNGMethod method = failedTest.getMethod();
			if (context.getFailedTests().getResults(method).size() > 1) {
				listOfFailedTests.remove();
			} else {
				if (context.getPassedTests().getResults(method).size() > 0) {
					listOfFailedTests.remove();
				}
			}
		}

	}

}
