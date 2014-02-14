package com.test.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class Sample {
	
	List<Integer> listIntegers = new ArrayList<Integer>();
	
	@Test
	public void sumOfIntegers(){
		
		listIntegers.add(1);
		listIntegers.add(9);
		
		int sum=0;
		Iterator<Integer> listIterator = listIntegers.listIterator();
		
		while(listIterator.hasNext()){
			sum +=listIterator.next();
		}
		
		System.out.println(sum);
		int forEachsum=0;
		for (int iterable_element : listIntegers) {
			forEachsum += iterable_element;
		}
		
		System.out.println(forEachsum);
	}
	

}
