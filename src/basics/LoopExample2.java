package basics;

public class LoopExample2 {

void display() {
		
		for (int num =50; num <= 10; num--) {
			 if (num % 3==0) {
				System.out.println(num + " is divisible by 3"); 
			 }
			
		}
		
	}
	
	public static void main(String[] args) {
		LoopExample2 loopExample2= new LoopExample2();
		loopExample2.display();
	}
	
}
