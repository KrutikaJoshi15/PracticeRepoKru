package basics;
/* write a java program print the count of numbers which are between 1 to 50 and 
 * divisible by 3 and 5*/
 
public class LoopExample6 {
	int count;
void display() {
		
		for(int num=1 ; num<=50; num++) {
			if(num%3==0 && num%5==0) {
				count++;
				System.out.println(count);
			}			
		}		
	}
	public static void main(String[] args) {
		LoopExample6 loopExample6 = new LoopExample6();
		loopExample6.display();
	}
}
