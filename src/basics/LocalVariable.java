package basics;

public class LocalVariable {
	int num1;
	int num2;
	
	void processData(int num1) {
		num2=num1+10;
		num1=num2+20;
		System.out.println(num1);
		System.out.println(num2);
	}
	
	void updateDate(int num2) {
		int num1= 100;
		num2= num1+num2;
	}

	void printData() {
		System.out.println(num1);
		System.out.println(num2);
}

	public static void main(String[] args) {
		LocalVariable localVariable= new LocalVariable();
		localVariable.processData(5);
		localVariable.updateDate(10);
		localVariable.printData();
}
}
