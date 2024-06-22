package basics;

public class Assignment6 {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatmentCount;
	
	void debitAmount(int amount) {
		if(amount <=0) {
			System.out.println("Invalid Amount");
		}else if(amount> balance){
			System.out.println("Insufficient balance");
		}else {
		balance = balance - amount;
		debitCount++;
			}
		}
	
	void creditAmount(int amount) {
		if(amount <=0) {
			System.out.println("Invalid Amount");
		}else if(amount <=5000) {
			balance = balance + amount;
			creditCount++;
		}else {
			System.out.println("You can't deposit more than 5000 Rs in one go");
		}
	}
	
	void printInfo() {
		System.out.println("Remaining balance is " + balance);
		printStatmentCount++;
	}
	
	
	void printCountInfo() {
		System.out.println("Debit operation is performed " + debitCount);
		System.out.println("Credit operation is performed " + creditCount);
		System.out.println("PrintStatement operation is performed " + printStatmentCount);
	}
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.debitAmount(300);
		assignment6.debitAmount(0);
		assignment6.debitAmount(10000);
		assignment6.printInfo();
		assignment6.creditAmount(500);
		assignment6.creditAmount(-1);
		assignment6.creditAmount(5001);
		assignment6.creditAmount(300);
		assignment6.creditAmount(500);
		assignment6.printInfo();
		assignment6.printCountInfo();
		
	}
}
