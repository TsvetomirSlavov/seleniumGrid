package com.test.java.problems.projecteuler;

import org.testng.annotations.Test;

public class LargestPalindrome {

	@Test
	public void test() {
			largestPalindrome();
	}

	public boolean isPalindrome(long Number) {

		int noOfDigits = 1;
		long left, right = 0;

		if (Number < 0)
			return false;

		while (Number / noOfDigits >= 10)
			noOfDigits *= 10;

		while (Number != 0) {
			left = Number % 10;
			right = Number / noOfDigits;

			if (left != right)
				return false;

			Number = Number % noOfDigits / 10;
			noOfDigits /= 100;
		}

		return true;
	}
	
	public void largestPalindrome(){
		long largestPalindrome = 1;
		
		for (int i = 999; i > 100; i--) {
			
			for (int j = i; j > 100; j--) {
				if(isPalindrome(i*j) & largestPalindrome < (i*j)) 
					largestPalindrome = i*j;
			}
			
		}
		
		System.out.println("Largest Palindrome is " + largestPalindrome);
		
	}

}
