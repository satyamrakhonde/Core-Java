package com.zensar;

interface Printable{
	void print();
}


class Circle implements Printable{
	@Override
	public void print() {
		System.out.println("Circle Printed");
	}
	
}

class Emp implements Printable{
	@Override
	public void print() {
		System.out.println("Employee Printed");
	}
	
	@Override 
	public void sort() {
		
	}
}
public class PrintableTest {

	public static void main(String[] args) {
		//collect circle & employee together and print all objects
		Printable p[] = new Printable[4];
		p[0] = new Circle();
		p[1] = new Emp();
		printAll(p);
	
	}
	public static void printAll(Printable p[]) {
		for(int i=0; i <p.length;i++)
			p[i].print();
	}
}
