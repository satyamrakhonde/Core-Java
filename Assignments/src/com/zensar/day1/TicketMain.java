package com.zensar.day1;

public class TicketMain {

	public static void main(String[] args) {
	
		TicketPrice t = new TicketPrice("Satyam","Raipur","Pune",21, 2000);
		Bus b = new Bus("Satyam","raipur","pune",4,2000);
		b.busticketprice();
		System.out.println("Details of bus traveller:"+b);
		
		Flight f = new Flight("Delta","Goa","Delhi",50, 9000);
		f.flightprice(16.78, false);
		System.out.println("Details of flight"+f);
		
		Train e = new Train("alpha","Goa","Delhi",10, 11000);
		e.trainticketprice("2AC");
		System.out.println("Details of flight"+e);
		
		double com =(f.price+b.price+e.price)*0.02;
		System.out.println("Agent overall commission"+com);
	}
}