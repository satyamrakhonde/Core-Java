package com.zensar;

public class Manager extends Employee{

 	private double incentive;
 	public Manager(int id, String name, double salary, double incentive) {
 		super(id,name,salary);
 		this.incentive=incentive;
 	}
 	
 	public double getSalary() {
 		return super.getSalary() + this.incentive;
 	}
} 
