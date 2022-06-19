package com.zensar.day1;

public class Train extends TicketPrice{

	float price;
	
	public Train(String name, String to, String from, int seatno, float basicprice) {
		super(name,to,from,seatno,basicprice);
	}
	float trainticketprice(String seattype) {
		if(seattype == "2AC") {
			price = 2*basicprice;
		}
		else if(seattype == "3AC") {
			price = 3*basicprice;
		}
		else
			price = basicprice;
		
		return price;
	}
	@Override
	public String toString() {
		return "Train [price=" + price + ", name=" + name + ", to=" + to + ", from=" + from + ", seatno=" + seatno
				+ ", basicprice=" + basicprice + "]";
	}
	
}
