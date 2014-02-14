package com.test.java.problems.projecteuler;

import org.testng.annotations.Test;

public class MyThread {

	
	@Test
	public void myThread(){
		
		ThreadsImplementsRunnable myThread = new ThreadsImplementsRunnable();
		Thread t = new Thread(myThread);
		t.start();
		
		while (ThreadsImplementsRunnable.count <=5) {
			System.out.println("Main Thread" + (++ThreadsImplementsRunnable.count));
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
