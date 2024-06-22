package basics;
//print all the numbers which are divisible by 3 and 5 on user defined range
public class Assignment11 {
	void m1(int startRange, int endRange) {
		for (int n=startRange; n<=endRange; n++) {
			if(n%5==0 && n%3==0) {
				System.out.println(n + " is divisible by 3 and 5");
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.m1(5, 40);
	}
}
