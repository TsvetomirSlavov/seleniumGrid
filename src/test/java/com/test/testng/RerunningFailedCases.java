package com.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunningFailedCases {

	private int count;

	@Test()
	public void test1() {
		if (count == 3) {
			Assert.assertTrue(true);
		} else {
			count++;
			Assert.assertTrue(false);
		}
	}

}
