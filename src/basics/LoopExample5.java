package basics;
/* write a java program which will print the no between 100 to 200 
and is divisible by 3 and 5*/

public class LoopExample5 {

	void display() {
		
		for(int num=100 ; num<=200; num++) {
			if(num%3==0 && num%5==0) {
				System.out.println(num + " is divisble by both 3 and 5");
			}			
		}		
	}
	
	public static void main(String[] args) {
		LoopExample5 loopExample5 = new LoopExample5();
		loopExample5.display();
	}
}
