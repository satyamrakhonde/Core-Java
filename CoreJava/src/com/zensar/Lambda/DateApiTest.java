package com.zensar.Lambda;

import java.time.LocalDate;

public class DateApiTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate "+localDate);
		
		localDate = LocalDate.of(2022, 1, 26);
		System.out.println(" Custom LocalDate "+localDate);
		System.out.println("Day:"+localDate);
		System.out.println("Month: "+localDate.getDayOfMonth());
		System.out.println("Year: "+localDate.getDayOfYear());

		

	}

}
