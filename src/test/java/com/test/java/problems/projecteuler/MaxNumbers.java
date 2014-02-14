package com.test.java.problems.projecteuler;

import org.testng.annotations.Test;

public class MaxNumbers {

	@Test
	public void test() {
		System.out.println(isArmstrongNumber(371));
	}

	public void printTwoMaxNumbers(int[] nums) {

		int maxOne = 0;
		int maxTwo = 0;

		for (int i : nums) {

			if (maxOne < i) {
				maxTwo = maxOne;
				maxOne = i;
			} else if (maxTwo < i) {
				maxTwo = i;
			}

		}

		System.out.println(maxOne);
		System.out.println(maxTwo);
	}

	public boolean isArmstrongNumber(int num) {
		int noumberOfDigits = String.valueOf(num).length();
		int originalValue = num;
		int temp = 0;
		int sum = 0;

		while (num > 0) {
			temp = num % 10;
			int indPowers = 1;
			for (int i = 0; i < noumberOfDigits; i++) {
				indPowers *= temp;
			}

			sum += indPowers;

			num = num / 10;
		}

		if (originalValue == sum) {
			return true;
		} else {
			return false;
		}

	}
}
