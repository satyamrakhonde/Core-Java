package com.zensar;

import java.util.ArrayList;
import java.util.List;

public class NumberListDemo {

	public static void main(String[] args) {
		List numberList = new ArrayList();
		
		numberList.add(5);
		int i = 25;
		numberList.add(i);
		numberList.add(75);
		numberList.add(25);
		numberList.add(5);
		numberList.add(2);
		
		System.out.println(numberList);

		//Auto-Boxing is the process of converting primitive to its corresponding object representation
		int x = 100; //primitive integer variable
		Integer intObj =new Integer(x); //manual boxing
		System.out.println(intObj.intValue());
		
		//intObj == intObj.intValue();
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Long.BYTES);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		
		String str = "200";
		Integer intString = new Integer(str);
		System.out.println(intString); //Auto-Unboxing
		
		//Unboxing -- is the process of converting Object to it's primitive value.
		
	}
}
