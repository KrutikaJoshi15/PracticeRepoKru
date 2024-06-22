package basics;

public class LoopExample8 {

	void display() {
			
			for(int num=1 ; num<=50; num++) {
				if(num%7==0 || num%13==0) {
					if (num%7==0) {
						System.out.println(num + " is divisible by 7");
					} else {
						System.out.println(num + " is divisible by 13");
					}
					
				}			
			}		
		}
		public static void main(String[] args) {
			LoopExample8 loopExample8 = new LoopExample8();
			loopExample8.display();
			
		}
	
}
