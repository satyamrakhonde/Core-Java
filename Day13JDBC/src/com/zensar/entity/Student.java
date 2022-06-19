package com.zensar.entity;

public class Student {
	private int roll_no;
	private String name;
	private String email;
	private String father_name;
	public Student(int roll_no, String name, String email, String father_name) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.email = email;
		this.father_name = father_name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	
	
}
