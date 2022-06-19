package com.zensar;

public class Account{
	private int accountno;
	private String name;
	private int accountbalance;
	public Account(int accountno, String name, int accountbalance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.accountbalance = accountbalance;
	}
	public int getAccountbalance() {
		return this.accountbalance;
	}
}