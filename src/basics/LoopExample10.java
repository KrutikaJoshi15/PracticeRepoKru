package basics;
//print average of numbers divisible by 3 and user should be able to enter start range and end range
public class LoopExample10 {
	
void display(int startRange, int endRange) {
		int count = 0;
		int sum= 0;
		for(int num=startRange ; num<=endRange; num++) {
			if(num%3==0) {
				count++;
				sum = sum+num;
				System.out.println(num + " is divisible by 3");	
			}				
		}System.out.println("count is " + count);
		System.out.println("Sum is " + sum);
		System.out.println("average is " + (sum/count));
	}	
	public static void main(String[] args) {
		LoopExample10 loopExample10 = new LoopExample10();
		loopExample10.display(1, 20);		
	}
}
