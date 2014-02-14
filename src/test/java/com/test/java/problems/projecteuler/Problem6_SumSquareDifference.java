package com.test.java.problems.projecteuler;

import org.testng.annotations.Test;

public class Problem6_SumSquareDifference {

	/**
	 * The sum of the squares of the first ten natural numbers is,
	 * 
	 * 1^2 + 2^2 + ... + 10^2 = 385 The square of the sum of the first ten
	 * natural numbers is,
	 * 
	 * (1 + 2 + ... + 10)^2 = 55^2 = 3025 Hence the difference between the sum
	 * of the squares of the first ten natural numbers and the square of the sum
	 * is 3025 − 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one
	 * hundred natural numbers and the square of the sum.
	 */

	@Test
	public void test() {
		diffrence(100, 100);
	}

	public void diffrence(long sumOfSquare, long squareOfSum) {
		long differnce = sumOfSquare(sumOfSquare) - squareOfSum(squareOfSum);
		System.out.println(differnce);
	}

	public long sumOfSquare(long num) {
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		return sum *= sum;

	}

	public long squareOfSum(long num) {
		long sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i * i;
		}
		return sum;
	}

}
