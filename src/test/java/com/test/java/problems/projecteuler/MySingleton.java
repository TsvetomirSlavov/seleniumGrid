package com.test.java.problems.projecteuler;

public class MySingleton {
	
	private static MySingleton singleTon = null;
	
	protected MySingleton(){
		
	}
	
	public static MySingleton getInstance(){
		if (singleTon==null) {
			singleTon = new MySingleton();
		}
		
		return singleTon;
	}

}
