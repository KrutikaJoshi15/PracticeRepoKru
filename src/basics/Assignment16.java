package basics;

public class Assignment16 {
	
	void m1(int startRange, int endRange) {
		int sum=0;
		int count=0;
		for (int num=startRange; num<=endRange; num++) {
			if(num%5==0 && num%7==0) {
			sum= sum+num;	
			count++;
			}
		}System.out.println(sum);
		System.out.println(sum/count);
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.m1(1, 110);
		
		
	}
}
