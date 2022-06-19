package com.zensar.day1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyDate{
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		super();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}