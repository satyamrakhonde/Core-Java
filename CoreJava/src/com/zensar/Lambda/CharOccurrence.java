package com.zensar.Lambda;

import java.util.Scanner;

public class CharOccurrence {

	public static int count(String string,char c) {
		int count = 0;
		
		for(int i =0;i<string.length();i++){
				if(string.charAt(i) == c)
					count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = sc.nextLine();
		System.out.println("Enter a character you want to search");
		char c = sc.next().charAt(0);
		System.out.println(count(string,c));
	}
	

}
