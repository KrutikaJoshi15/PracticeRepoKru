package forLoop;
//On user defined range print sum and average of numbers which is divisible by 5 & 7.
public class Assignment16 {

	void sumAndAverageOfNumbers(int startRange, int endRange) {
		int sum=0;
		int num;
		int count=0;
		for(num=startRange; num<=endRange; num++) {
			if(num%5==0 && num%7==0) {
				sum=sum+num;
				count++;				
			}
		}
		System.out.println("Sum of all numbers divisible by 5 and 7 are "+ sum);
		System.out.println("Average of all numbers divisible by 5 and 7 are "+ (sum/count));
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16= new Assignment16();
		assignment16.sumAndAverageOfNumbers(1, 110);
	}
}
