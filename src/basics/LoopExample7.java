package basics;
// count with OR condition. Print only final count.
public class LoopExample7 {	
	static int count;
	void display() {
			
			for(int num=1 ; num<=50; num++) {
				if(num%7==0 || num%13==0) {
					count++;
				}			
			}		
		}
		public static void main(String[] args) {
			LoopExample7 loopExample7 = new LoopExample7();
			loopExample7.display();
			System.out.println(count);
		}
}
