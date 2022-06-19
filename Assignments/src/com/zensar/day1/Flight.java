package com.zensar.day1;

public class Flight extends TicketPrice{
	
	double price;
	float weight;
	boolean insurance;
	
	public Flight(String name, String to, String from, int seatno, float basicprice) {
		super(name,to,from,seatno,basicprice);
	}
	
	double flightprice(double weight,boolean insurance) {
		
		if(weight <= 15 && insurance == true)
			price = basicprice + 0.01*basicprice;
		
		else if(weight <= 15 && insurance == false)
			price = basicprice;
		
		else if(weight > 15 && insurance == true)
			price = basicprice + 0.03*basicprice + 0.01*basicprice;

		else
			price = basicprice + 0.03*basicprice;
		
		return price;
	}

	@Override
	public String toString() {
		return "Flight [price=" + price + ", weight=" + weight + ", insurance=" + insurance + "]";
	}

	
}
