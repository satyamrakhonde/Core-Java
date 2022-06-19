package com.zensar;

public class CurrentAccount extends Account{

	int cashcredit;
	public CurrentAccount(int accountno, String name, int accountbalance,int cashcredit) {
		super(accountno,name,accountbalance);
		this.cashcredit=cashcredit;
	}
	public int getAccountbalance() {
		return super.getAccountbalance() + this.cashcredit;
	}
}
