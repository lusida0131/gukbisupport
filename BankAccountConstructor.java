package ch07;
class BankAccount4 {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public BankAccount4(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("°èÁÂ¹øÈ£: " + accNumber);
		System.out.println("ÁÖ¹Î¹øÈ£: " + ssNumber);
		System.out.println("ÀÜ ¾×: " + balance + '\n');
		return balance;
	}
}

public class BankAccountConstructor {

	public static void main(String[] args) {

		BankAccount4 yoon = new BankAccount4("12-34-89","990990-9090990", 10000);
		BankAccount4 park = new BankAccount4("33-55-09","770088-5959007", 10000);
		
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();		
	}

}
