package basics;
//print first five even nos with for loop
public class Assignment20 {
	
	void m1(int startRange, int endRange) {
		int count =0;
		for(int n=startRange; n<= endRange; n++) {
			if(n%2==0) {
				System.out.println(n+ " is a even no");
				count++;
					if(count==5) {
						break;
					}
			}
		}
	}
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.m1(1, 20);
	}
}
