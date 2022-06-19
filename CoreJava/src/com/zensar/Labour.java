package com.zensar;

public class Labour extends Employee{

	private double overtime;
	public Labour(int id, String name, double salary,double overtime) {
		super(id,name,salary);
		this.overtime=overtime;
	}
	
	public double getSalary() {
		return super.getSalary() + this.overtime;
	}
}
