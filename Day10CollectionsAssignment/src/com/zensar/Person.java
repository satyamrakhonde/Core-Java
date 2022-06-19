package com.zensar;

public class Person {

	int weight;
	int height;
	String name;
	
	public Person(int weight,int height, String name)
	{
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getweight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//class myPersonComparator implements Comparator<persons>
}

