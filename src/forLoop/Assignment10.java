package forLoop;
//print all even numbers in a user defined range.
public class Assignment10 {
	
	void getEvenNumbers(int startRange, int endRange) {
		if(startRange<endRange) {
			for(int num=startRange; num<=endRange; num++) {
				if(num%2==0) {
					System.out.println("Even numbers are "+ num);
				}
			}
		}else if(startRange>endRange){  
			for(int num=endRange; num<=startRange; num++) {
				if(num%2==0) {
					System.out.println("Even numbers are "+ num);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment10 assignment10= new Assignment10();
		assignment10.getEvenNumbers(10, 15);
		assignment10.getEvenNumbers(15, 10);
	}
}
