
public class Account {
	
	int balance = 1000;
	int sum = 0;
	
	void deposit(int a) {
		sum = sum + a;
	}
	
	void withdraw(int b) {
		sum = sum + balance - b;
	}
	
	void showBalance() {
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac = new Account();
		ac.deposit(5000);
		ac.withdraw(500);
		ac.showBalance();
	}

}
