package com.test.testng;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * This class explains how to pass parameters in runtime based on method name or
 * group name
 * http://www.mkyong.com/unittest/testng-tutorial-6-parameterized-test/
 * 
 * @author mulakshmanan
 * 
 */
public class TestParameterDataProvider {

	@Test(dataProvider = "dataProvider", groups = { "groupA" })
	public void test1(int number) {
		Assert.assertEquals(number, 1);
	}

	@Test(dataProvider = "dataProvider", groups = "groupB")
	public void test2(int number) {
		Assert.assertEquals(number, 2);
	}

	@DataProvider(name = "dataProvider")
	public Object[][] provideData(ITestContext context) {

		Object[][] result = null;

		// get test name
		// System.out.println(context.getName());

		for (String group : context.getIncludedGroups()) {

			System.out.println("group : " + group);

			if ("groupA".equals(group)) {
				result = new Object[][] { { 1 } };
				break;
			}

		}

		if (result == null) {
			result = new Object[][] { { 2 } };
		}
		return result;

	}

	@Test(dataProvider = "dataProvider1")
	public void test1(int number, int expected) {
		Assert.assertEquals(number, expected);
	}

	@Test(dataProvider = "dataProvider1")
	public void test2(String email, String expected) {
		Assert.assertEquals(email, expected);
	}

	@DataProvider(name = "dataProvider1")
	public Object[][] provideData(Method method) {

		Object[][] result = null;

		if (method.getName().equals("test1")) {
			result = new Object[][] { { 1, 1 }, { 200, 200 } };
		} else if (method.getName().equals("test2")) {
			result = new Object[][] { { "test@gmail.com", "test@gmail.com" },
					{ "test@yahoo.com", "test@yahoo.com" } };
		}

		return result;

	}
}