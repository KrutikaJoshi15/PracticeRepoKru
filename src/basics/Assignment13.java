package basics;

public class Assignment13 {
	
	void m1(int startRange, int endRange) {
		int num=0;
		for (int n=startRange; n<=endRange; n++) {
			if(n%5==0 && n%9==0) {			
			num= n;
			}
			}System.out.println(num);
		}
	
	
	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.m1(5, 100);	
	}
}
