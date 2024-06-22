package basics;

public class LoopExample3 {

void display() {
		
		for (int num =50; num <= 10; num--) {
			 if (num % 3==0) {
				System.out.println(num + " is divisible by 3"); 
			 }
			
		}
		
	}
	
	public static void main(String[] args) {
		LoopExample3 loopExample3= new LoopExample3();
		loopExample3.display();
	}
	
}
