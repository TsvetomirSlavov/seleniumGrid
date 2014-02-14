package com.test.java.problems.projecteuler;

public class ThreadsImplementsRunnable implements Runnable {
	
	public static int count = 0;
	public ThreadsImplementsRunnable(){
		
	}

	public void run() {
		while(ThreadsImplementsRunnable.count <=5){
			System.out.println("My Thread" + (++count));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
