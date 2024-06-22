package basics;
//calculator program having 4 parameterized methid for add, sub. div and multiplication.
public class Assignment1 {
	
	void addition(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 + num2));
	}
	
	void subtraction(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 - num2));
	}
	
	void multiplication(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 * num2));
	}
	
	void division(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 / num2));
	}
	
	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		assignment1.addition(20, 30);
		assignment1.subtraction(50, 22);
		assignment1.multiplication(50, 5);
		assignment1.division(200, 10);
	}
}
