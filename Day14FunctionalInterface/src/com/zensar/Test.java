package com.zensar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//anonymous inner class implementation
		//create anonymous inner class object
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New thread created");
			}
		}).start();
		
		//Same as above 
//		MyRunnableThread ref1 = new MyRunnableThread();
//		Thread t1 = new Thread(ref1);
//		t1.start();
	}

}
