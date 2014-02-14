package com.test.java.problems.projecteuler;

import java.math.BigInteger;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class LargestPrimeFactors {

	
	public static void main(String[] args) {
	    //long num = getLong("What number do you want to analyse? ");
	    System.out.println(largestPrimeFactor(986535));
	}
	
	
	
	public static int largestPrimeFactor(long number) {
		int i;
		for (i = 2; i <= number; i++) {
			if (number % i == 0) {
				number /= i;
				i--;
			}
		}
		return i;
	}

	// @Test
	public void reverserArray() {
		int[] nums = { 5, 2, 7, 2, 4, 7, 8, 2, 3 };
		int temp = 0;

		for (int i : nums) {
			System.out.println(i);
		}

		System.out.println("After reversing");

		for (int i = 0; i < nums.length / 2; i++) {
			temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;
		}
		for (int i : nums) {

			System.out.println(i);

		}
	}

	@Test
	public void swap() {
		int x = 10;
		int y = 20;
		System.out.println("Before swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}

}
