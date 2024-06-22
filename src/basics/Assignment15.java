package basics;

public class Assignment15 {
	
	void m1(int startRange, int endRange) {
		int count=0;
		for (int num=startRange; num<=endRange; num++) {
			if(num%3==0 && num%4==0) {
				count++;
				if(count<=3) {
					System.out.println(num);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.m1(10, 500);
		
	}
}
