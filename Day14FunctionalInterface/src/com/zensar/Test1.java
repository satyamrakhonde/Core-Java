package com.zensar;

public class Test1 {

	public static void main(String[] args) {
		// Using Lambda providing implementation to abstract run method of runnable interface
		new Thread(() -> {
			System.out.println("New thread created");
		}).start();
	}

}
