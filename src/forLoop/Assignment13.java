package forLoop;
//On user defined range print last number which is divisible by 5 & 9.
public class Assignment13 {

	void getLastNumber(int startRange, int endRange) {
		for(int num=endRange; num>=startRange; num--) {
			if(num%5==0 && num%9==0) {
			System.out.println("Last number divisible by 5 and 9 is "+ num);
			break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment13 assignment13= new Assignment13();
		assignment13.getLastNumber(5, 100);
	}
}
