package forLoop;
//On user defined range print all numbers which are divisible by 7 or 13 in reverse order.
public class Assignment12 {
	
	void getNumbersDivisibleBy7And13(int startRange, int endRange) {
		for(int num=endRange; num>=startRange; num--) {
			if(num%7==0 || num%13==0) {
				if(num%7==0 && num%13==0){
					System.out.println(num+ " is divisible by 7 and 13");
				}else if(num%7==0) {
					System.out.println(num+ " is divisible by " + 7);
				}else if(num%13==0){
					System.out.println(num+ " is divisible by " + 13);
				}		
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12= new Assignment12();
		assignment12.getNumbersDivisibleBy7And13(5, 40);
	}
}
