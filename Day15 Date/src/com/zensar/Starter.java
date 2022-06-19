package com.zensar;

import java.time.LocalDate;
import java.util.Date;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date utilDate = new Date();
		
		System.out.println("Date in full format"+utilDate);
	
		java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println("SQL Date is: "+sqlDate);
		
		utilDate = new Date(122,1,23, 11,02);
		System.out.println(utilDate);
		
		//utilDate = new GregoraianCalendar(122, 1, 23);
		
		Employee emp = new Employee();
		
		com.zensar.model.Employee emp2 = new com.zensar.model.Employee();
		
		LocalDate localDate =LocalDate.now();
		System.out.println(localDate);
		
		LocalDate date = localDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		System.out.println("Today date : "+date);
		System.out.println("Yesterday date : "+yesterday);
		System.out.println("Tomorrow date : "+tomorrow);
	
	}

}
