package com.zensar;

public class Mythreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is anonymous implementation of run method");
			}
		});
		t2.start();
		
		Thread t3 = new Thread(() ->{System.out.println("This is Lambda implementation of run method");});
		t3.start();
		//Runnable ref1 = new Runnable();
		//Runnable interface can't be instantiated using new keyword directly
		//bcos, there is no implementation available for the abstract method run
	}

}
