package basics;

public class BreakExample1 {

	void display() {
		int count = 0;
		
		for(int num=1; num <=100; num++) {
			if (num%5==0) {
				count++;
				System.out.println(num + " is divisible by 5");
				
				if(count == 5) {
					break;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		BreakExample1 breakExample1 = new BreakExample1();
		breakExample1.display();
	}
}
