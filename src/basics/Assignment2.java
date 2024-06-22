package basics;

public class Assignment2 {
	 static int num3;
	void addition(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 + num2));
		num3 = num3+ (num1+ num2);
	}
	
	void subtraction(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 - num2));
		num3= num3+ ((num1 - num2));
	}
	
	void multiplication(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 * num2));
		num3= num3+(num1 * num2);
	}
	
	void division(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 / num2));
		num3 = num3+ (num1 / num2);
	}

		
	
	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		assignment2.addition(20, 30);
		assignment2.subtraction(50, 22);
		assignment2.multiplication(50, 5);
		assignment2.division(200, 10);
		System.out.println("Addition of all methods is " +num3);
	}
}

/* other way of writing this program is:
 * package basics;

public class Assignment2 {
	 
	void addition(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 + num2));
		num3 = num1+ num2;
	}
	
	void subtraction(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 - num2));
		num4= num1 - num2;
	}
	
	void multiplication(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 * num2));
		num5= num1 * num2;
	}
	
	void division(int num1, int num2) {
		System.out.println("Addition of two nos is " + (num1 / num2));
		num6 = num1 / num2;
	}

	void printAdditionOfMethods() {
		System.out.println("Addition of all methods is " + (num3+num4+num5+num6));		
	}	
	
	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		assignment2.addition(20, 30);
		assignment2.subtraction(50, 22);
		assignment2.multiplication(50, 5);
		assignment2.division(200, 10);
		assignment2.printAdditionOfMethods();
	}
}
*/
 


