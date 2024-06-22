package basics;
//print first five even nos by while loop
public class Assignment20DoWhile {
	
	void m1() {
		int n=2;	
		int count =0;
		while(n%2==0) {
			System.out.println(n + " is even no");
			n= n +2;
			count++;
			if(count==5) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment20DoWhile assignment20DoWhile = new Assignment20DoWhile();
		assignment20DoWhile.m1();
	}
}
