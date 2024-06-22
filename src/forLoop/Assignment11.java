package forLoop;
//Divisible by 3 and 5 numbers in the given range
public class Assignment11 {
	
	void getNumbersDivisibleBy3And5(int startRange, int endRange) {
		for(int num=startRange; num<=endRange; num++) {
			if(num%3==0 && num%5==0) {
				System.out.println("Divisible by 3 and 5 numbers are "+ num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.getNumbersDivisibleBy3And5(5, 40);
	}
}
