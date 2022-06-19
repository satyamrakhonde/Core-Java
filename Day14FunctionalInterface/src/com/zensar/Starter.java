package com.zensar;

import java.util.ArrayList;
import java.util.List;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFunctionalInterface ref1 =new MyFunctionalInterface() {
			
			@Override
			public void show() {
				System.out.println("This is a way of creating ref to interface - Anonymous Inner Type");
			}
		};
		
		List nameList = new ArrayList();
		
		ref1.show();
		
		MyFunctionalInterface ref2 = () ->{System.out.println("This is lambda implementation");};
		ref2.show();
		
		//Lambda with one argument
		FuncInterface2 ref3 = n-> System.out.println("value of n ="+n);
		ref3.square(5);
		
		//Lambda with one argument
		FuncInterface2 ref4 = (n)-> System.out.println("square of n = "+(n*n));
		ref4.square(4);
		
		//Lambda with two arguments
		FuncInterface3 ref5 = (a,b)->(a+b);
		System.out.println("Sum of two values = "+ref5.add(5, 7));
		System.out.println("Sum of two values = "+ref5.add(100, 784));
		System.out.println("Sum of two values = "+ref5.add(-800,600));
	
		//System.out.println("Sum of two values = "+ref5.add(100.78f,600.29f));

		//MyFunctionalInterface ref3 = () -> System.out.println("value of n ="+n);
		//ref3.square(5);
	}

}
