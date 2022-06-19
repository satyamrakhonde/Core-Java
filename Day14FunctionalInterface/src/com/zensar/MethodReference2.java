package com.zensar;

public class MethodReference2 {
	
	public static void ThreadStatus() {
		System.out.println("run method implementation static reference using Thread is Running");
	}
	
	public static void main(String[] args) {
		Thread t2 = new Thread(MethodReference2::ThreadStatus);
		t2.start();
	}
}
