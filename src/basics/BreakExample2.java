package basics;

public class BreakExample2 {
	void display(int startRange, int endRange) {
		for (int num =startRange; num<= endRange; num++) {
			if (num%5==0) {
				System.out.println(num + " is divisible by 5");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		BreakExample2 breakExample2 = new BreakExample2();
			breakExample2.display(1, 100);	
			System.out.println("End");
	}
}
