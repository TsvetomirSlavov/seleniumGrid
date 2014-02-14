package com.test.java.problems.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.bouncycastle.util.Integers;
import org.testng.annotations.Test;

public class Factorial {
	
	
	@Test
	public void factorial(){
		
		System.out.println(isPrime(997));
		
	}
	
	private int computeFactorial(int i){
		int factorial = 1;
		
		while(i>=1){
			factorial *= i;
			i--;
		}
		return factorial;
	}
	
	private void factors(int num){
		
		Set<Integer> factors = new HashSet<Integer>();
		
		int myNumber =num;
		int i=2;
		
		while (i < myNumber) {
			
			if(myNumber% i == 0){
				factors.add(i);
				
				myNumber = myNumber/i;
				i=2;
			}
			i++;
		}
		
		for (Integer integer : factors) {
			System.out.println(integer);
		}
		
		
	}
	
	public static boolean isPrime(int n){
		
		boolean isPrime=true;
		if(n%2 == 0){
			
			isPrime=false;
		} else {
			for(int i=3; i*i < n ; i += 2){
				if (n%i == 0)
					isPrime=false;
				}
		}
		
		return isPrime;
		
	}
	
	
	public void duplicateNubmer(){
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(1);
		myNumbers.add(2);
		myNumbers.add(3);
		myNumbers.add(4);
		myNumbers.add(4);
		
		System.out.println(myNumbers);
		
		Set<Integer> eradicateDuplicate = new TreeSet<Integer>(myNumbers);
		ArrayList<Integer> distinctList = new ArrayList<Integer>(eradicateDuplicate);
		
		System.out.println(distinctList);
		
		myNumbers.removeAll(distinctList);
		
		for (Integer integer : myNumbers) {
			
			System.out.println(integer);
			
		}
		
		}

	
	public int reverseNumber(int number){
		System.out.println(number);
		int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        System.out.println(reverse);
        return reverse;
	}
	
	
	public int sumOfNumber(int number){
		System.out.println(number);
		int sum = 0;
		while(number !=0){
			sum += number%10;
			number = number/10;
		}
		System.out.println(sum);
		return sum;
	}
	
	public boolean isPerfectNumber(int number){
		int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            System.out.println("It is a perfect number");
            return true;
        } else {
            System.out.println("It is not a perfect number");
            return false;
        }
	}
	
	public void factor(int num){
		
		List<Integer> factors = new LinkedList<Integer>();
		
		for(int i = 1; i*2 < num; i++){
			if(num % i == 0 && isPrime(i)){
				factors.add(i);
			}
		}
		
		System.out.println("The largest prime factor is " + factors.get(factors.size()-1));
		
		for (Integer integer : factors) {
			System.out.println(integer);
		}
		
	}
	
	
	public void fibonacci(int num){
		Set<Integer> fibonacci = new TreeSet<Integer>();
		int prev,next,sum;
		prev=next=1;
		sum =0;
		fibonacci.add(next);
		fibonacci.add(prev);
		
		for(int i=1;;i++){
			
			sum = prev+next;
			prev = next;
			next = sum;
			
			
			if (sum >= num) {
				break;
			} else {
			fibonacci.add(sum);
			}
		}
		
		for (Integer integer : fibonacci) {
			System.out.println(integer);
		}
	}
	
	public void fibonacciWhileLoop(int num){
		
		Set<Integer> fibonacci = new TreeSet<Integer>();
		int prev,next,sum;
		prev=next=1;
		sum =0;
		fibonacci.add(next);
		fibonacci.add(prev);
		
		while(sum <=num){
			sum = prev+next;
			prev = next;
			next = sum;
			
			if (sum >=num) {
				break;
			}
			fibonacci.add(sum);
		}
		
		for (Integer integer : fibonacci) {
			System.out.println(integer);
		}
		
	}
}
