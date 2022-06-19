package com.zensar;

public class MyTestable {

	public static void doTest() {
		System.out.println("Static Reference to test method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static reference, we use double colon without paranthesis
		Testable ref1 = MyTestable::doTest;
		ref1.test();
		
		MyTestable.doTest();
	}

}
