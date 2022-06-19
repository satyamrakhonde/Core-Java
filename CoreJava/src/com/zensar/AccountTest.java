package com.zensar;

public class AccountTest {
	
	public static void main(String[] args) {
		Account ac[] = new Account[4];
		
		ac[0] = new SavingAccount(123,"satyam",40000,10000);
		ac[1] = new SavingAccount(167,"prashant",9000,1000);
		ac[2] = new CurrentAccount(124,"hero",10000,900);
		ac[3] = new CurrentAccount(156,"james",900,900);
		
		int totalBalance = getTotalBalance(ac);
		System.out.println("TotalCashInBanke =" +totalBalance);
	}
	
	public static int getTotalBalance(Account a[]) {
		int totalBalance = 0;
		for(int i =0; i<a.length;i++) {
			totalBalance = totalBalance + a[i].getAccountbalance();
		}
		return totalBalance;
	}
}
