package basics;

public class Assignment3 {
	int balance = 1000;
	
	void debitAmount(int amount){
		balance = balance - amount;
	}
	
	void creditAmount(int amount){
		balance = balance + amount;		
	}

	void printBalance(){
	 System.out.println("Available balance is " + balance);	
	}
	
	public static void main(String[] args) {
		Assignment3 assignment3= new Assignment3();
		assignment3.debitAmount(200);
		assignment3.creditAmount(500);
		assignment3.creditAmount(200);
		assignment3.debitAmount(700);
		assignment3.printBalance();
	}
}
