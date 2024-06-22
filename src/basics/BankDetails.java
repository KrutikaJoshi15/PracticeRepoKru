package basics;
class BankDetails{
	int initBalance;
	
	void setBalance(){
		initBalance = 1000;
	}

	void debitAmt(int amt){
		initBalance= initBalance-amt;
	}
	
	void creditAmt(int amt){
		initBalance= initBalance+amt;
	}
	
	void printBalance(){
		System.out.println("Now your Balance is " + initBalance);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails= new BankDetails();
		bankDetails.setBalance();
		bankDetails.debitAmt(300);
		bankDetails.creditAmt(500);
		bankDetails.creditAmt(200);
		bankDetails.creditAmt(800);
		bankDetails.debitAmt(1800);
		bankDetails.printBalance();
		
	}
}