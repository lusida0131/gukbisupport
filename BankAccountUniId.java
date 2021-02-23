package ch07;

class BankAccount3 {
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public void initAccount(String acc, String ss, int bal) {
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
class BankAccountUniId {
	public static void main(String[] args) {
		BankAccount3 yoon = new BankAccount3();
		yoon.initAccount("12-34-89","990990-9090990", 10000);
		
		BankAccount3 park = new BankAccount3();
		park.initAccount("33-55-09","770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}