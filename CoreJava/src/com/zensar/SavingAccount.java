package com.zensar;

public class SavingAccount extends Account{
	private int fixeddeposit;
	
	public SavingAccount(int accountno, String name, int accountbalance,int fixeddeposit)
	{
		super(accountno,name,accountbalance);
		this.fixeddeposit=fixeddeposit;
	}
	public int getAccountbalance() {
		return super.getAccountbalance() + this.fixeddeposit;
	}
}
