package basics;
//on user defined range print all the numbers which are divisible by 7 or 13 in reverse order
public class Assignment12 {
	void m1(int startRange, int endRange) {
		for (int n=endRange; n>=startRange; n--) {
			if(n%7==0 || n%13==0) {
				System.out.println(n + " is divisible by 3 and 5");
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.m1(5, 40);
	}
}
