package com.zensar;


@FunctionalInterface
public interface MyFunctionalInterface {

	// By default all the methods in interface are public and abstract
	
	void show(); //abstract method
	
	//adding a non-abstract method will give the compile time error
//	void display() {
//		
//	}
	
	//if you add one more abstract method them it will no more functional interface
	//void show1();
	
	//In java 8, it's allowed to use static and default methods
	static void display() {
		System.out.println("this is static method");
	}
	
	default void print() {
		System.out.println("This is default method");
	}
}
