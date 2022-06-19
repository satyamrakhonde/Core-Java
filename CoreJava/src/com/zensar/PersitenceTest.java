package com.zensar;

abstract class Persistence{
	abstract void persist();
}

class FilePersistence extends Persistence{
	@Override
	void persist() {
		System.out.println("Data persised into File");
	}
}

class DatabasePersistence extends Persistence{
	@Override
	void persist() {
		System.out.println("Data persised into Database");
	}
}
public class PersitenceTest {
	public static void main(String[] args) {
		Persistence p[] = new Persistence[4];
		p[0] = new FilePersistence();
		p[1] = new DatabasePersistence();
		
		p[0].persist();
		p[1].persist();
	}
}
