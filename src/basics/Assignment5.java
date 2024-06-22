package basics;

public class Assignment5 {

	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatmentCount;
	
	void debitAmount(int amount) {
		balance = balance - amount;
		debitCount++;
	}
	
	void creditAmount(int amount) {
		balance = balance + amount;
		creditCount++;
	}
	
	void printStatment() {
		System.out.println("Current balance is " + balance);
		printStatmentCount++;
	}
	
	void printCountInfo() {
		System.out.println("Debit operation is performed " + debitCount);
		System.out.println("Credit operation is performed " + creditCount);
		System.out.println("PrintStatement operation is performed " + printStatmentCount);
	}
	
	public static void main(String[] args) {
		Assignment5 assignment5 = new Assignment5();
		assignment5.debitAmount(300);
		assignment5.printStatment();
		assignment5.creditAmount(500);
		assignment5.creditAmount(300);
		assignment5.creditAmount(500);
		assignment5.printStatment();
		assignment5.printCountInfo();
		
	}
}
