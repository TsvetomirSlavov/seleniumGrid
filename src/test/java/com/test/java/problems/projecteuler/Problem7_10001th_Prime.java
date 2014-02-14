package com.test.java.problems.projecteuler;

import java.util.Date;

import org.testng.annotations.Test;

public class Problem7_10001th_Prime {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10001st prime number?
	 */

	@Test
	public void test() {
		long startTime = new Date().getTime();
		System.out.println(find_Nth_Prime(10001));
//		System.out.println(isPrime(123));
		
		long endTime = new Date().getTime();
		
		System.out.println("Total Time taken " + (endTime-startTime));
		
		
	}

	public int find_Nth_Prime(int givenNubmer) {
		int numPrimes = 1;
		int numm = 1;
		 
		while (numPrimes < givenNubmer) {
		    numm = numm + 2;
		    if (isPrime(numm)) {
		        numPrimes++;
		    }
		}

		return numm;
	}

	public boolean isPrime(int num) {
		if(num==2)
			return true;
		if (num % 2 == 0)
			return false;
		else {
			for (int i = 3; i * 2 < num; i +=2) {
				if (num % i == 0)
					return false;
			}
		}

		return true;
	}

}
