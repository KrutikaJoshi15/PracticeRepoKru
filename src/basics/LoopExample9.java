package basics;
//no divisible by 3 or divisible by 5. Also write when divisible by both
public class LoopExample9 {

	void display() {
		
		for(int num=1 ; num<=50; num++) {
			if(num%3==0 || num%5==0) {
				if(num%3==0 && num%5==0) {
					System.out.println(num + " is divisible by 3 and 5");
				} else if (num%3==0) {
					System.out.println(num + " is divisible by 3");
				} else {
					System.out.println(num + " is divisible by 5");
				}
				
			}			
		}		
	}	
	public static void main(String[] args) {
		LoopExample9 loopExample9 = new LoopExample9();
		loopExample9.display();
		
	}
}
