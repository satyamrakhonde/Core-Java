package com.zensar.Lambda;

@FunctionalInterface
interface MathOperation{
	public int operation(int x,int y);
}

public class Lambda {

	public static void main(String[] args) {
		MathOperation addition = (int x, int y) -> x+y;
		MathOperation sub = (int x, int y) -> x+y;
		MathOperation mul = (int x, int y) -> x+y;
		MathOperation division = (int x, int y) -> x+y;

		System.out.println("Addition:" +addition.operation(5, 15));
		System.out.println("Subtraction:" +addition.operation(10, 5));

	}
	
}
