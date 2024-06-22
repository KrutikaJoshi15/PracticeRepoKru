package basics;

public class LoopExample4 {

	void m1() {
		
		for(int num=50; num>=10; num=num-1) {
			
			if(num%3==0) {
				System.out.println(num + " is divisible by 3");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		LoopExample4 loopExamle4 = new LoopExample4();
		loopExamle4.m1();
	}
}
