package forLoop;
//On user defined range print first 3 numbers which is divisible by 3 & 4.
public class Assignment15 {
	
	void getFirst3Numbers(int startRange, int endRange) {
		int count= 0;
		for(int num=startRange; num<=endRange; num++) {
			if(num%3==0 && num%4==0) {
				count++;
				System.out.println("First three numbers divisible by 3 and 4 are "+ num);
				if(count<3) {
					continue;				
					}else if(count==3) {
						break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15= new Assignment15();
		assignment15.getFirst3Numbers(10, 500);
	}
}
