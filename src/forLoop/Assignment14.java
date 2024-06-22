package forLoop;
//On user defined range print sum of all the number which is divisible by 5 & 10.
public class Assignment14 {
	
	void getSumOfAllNumbers(int startRange, int endRange) {
		int sum=0;
		int num;
		for(num=startRange; num<=endRange; num++) {
			if(num%5==0 && num%10==0) {
				sum=sum+num;
			}
		}
		System.out.println("Sum of all numbers divisible by 5 and 10 is " + sum);
	}
	                                   
	public static void main(String[] args) {
		Assignment14 assignment14= new Assignment14();
		assignment14.getSumOfAllNumbers(10, 50);
	}
}
