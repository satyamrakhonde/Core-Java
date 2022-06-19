package com.zensar.day1;

public class Bus extends TicketPrice{

	float price;
	
	public Bus(String name, String to, String from, int seatno, float basicprice) {
		super(name,to,from,seatno,basicprice);
	}

	float busticketprice() {
		price = 2*basicprice;
		return price;
	}
	

	@Override
	public String toString() {
		return "Bus [price=" + price + "]";
	}
}
