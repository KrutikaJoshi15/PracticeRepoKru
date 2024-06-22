package basics;

public class Assignment14 {
	
	void m1(int startRange, int endRange) {
		int n=0;
		for (int num=startRange; num<=endRange; num++) {
			if(num%5==0 && num%10==0) {
			n=n+num;	
			}//System.out.println(n + " is divisible by 3 and 5");
		}System.out.println(n);
	}
	
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.m1(10, 50);
		
	}
}
