package com.test.testng;

import java.util.Iterator;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{
	
		@Override
	  public void onFinish(ITestContext context) {
		 
			// Get all the failed cases and create a list iterator
			Iterator<ITestResult> listOfFailedTests = context.getFailedTests()
					.getAllResults().iterator();

			// Iterate through the iterator
			while (listOfFailedTests.hasNext()) {

				// Get the ITestResult instance and create ITestNGMethod obj
				ITestResult failedTest = listOfFailedTests.next();
				ITestNGMethod method = failedTest.getMethod();

				// if the method appears in the context of failed test more than
				// once remove it
				if (context.getFailedTests().getResults(method).size() > 1) {
					listOfFailedTests.remove();

				} else {

					// if the method appears in the context of passed test more than
					// once remove it
					if (context.getPassedTests().getResults(method).size() > 0) {
						listOfFailedTests.remove();
					}
				}
			}

	  }

}
