package basics;

public class LoopExample1 {

	void display() {
		
		for (int num =1; num <= 100; num++) {
			 if (num % 5==0) {
				System.out.println(num + " is divisible by 5"); 
			 }
			
		}
		
	}
	
	public static void main(String[] args) {
		LoopExample1 loopExample1= new LoopExample1();
		loopExample1.display();
	}
}
