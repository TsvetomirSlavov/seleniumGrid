package com.test.java.problems.projecteuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Problems {

	// @Test
	public void sum_Of_multiples_of_Five_And_Three_Below_Thousand() {
		Set<Integer> multiplesOfFiveAndThree = new HashSet<Integer>();

		int sumofAllmultiples = 0;

		for (int i = 1; i < 1000; i++) {

			if (i % 3 == 0 || i % 5 == 0) {
				multiplesOfFiveAndThree.add(i);
			}
		}

		for (Integer integer : multiplesOfFiveAndThree) {
			sumofAllmultiples += integer;
		}

		System.out.println(sumofAllmultiples);

	}

	@Test
	public void FibonacciNumber_below4million_And_Even() {

		List<Integer> fibonaccci = new LinkedList<Integer>();
		fibonaccci.add(0, 1);
		fibonaccci.add(1, 2);

		Set<Integer> fibonaccciEven = new HashSet<Integer>();

		int sumOfFibonacci = 0;

		for (int i = 2; fibonaccci.get(i - 1) < 4000000; i++) {

			fibonaccci.add(i, fibonaccci.get(i - 1) + fibonaccci.get(i - 2));
		}

		for (Integer integer : fibonaccci) {
			System.out.println(integer);
			if (integer % 2 == 0) {
				fibonaccciEven.add(integer);
			}
		}

		for (Integer integer : fibonaccciEven) {
			System.out.println("Even" + integer);
			sumOfFibonacci += integer;
		}

		if (fibonaccci.get(fibonaccci.size()-1) % 2 == 0) {
			sumOfFibonacci -= fibonaccci.get(fibonaccci.size() - 1);
		}

		System.out.println("And the sum of even Fibanocci below 4 million is "
				+ sumOfFibonacci);

	}

	@Test
	public void Fibonacci() {
		int sum = 0, prev, next, i = 1;
		prev = next = 1;
		while (i < 4000000) {
			prev = next;
			next = i;
			i = prev + next;

			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.println(sum);
	}

}
