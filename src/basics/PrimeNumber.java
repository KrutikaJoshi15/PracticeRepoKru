package basics;
//find out the prime numbers and print them from a given range
public class PrimeNumber {
	void m1(int startRange, int endRange) {
		for(int num=startRange; num<=endRange; num++) {
			boolean flag= true;
			for(int index=2; index<num-1; index++) {
				if(num%index==0) {
					//System.out.println(num + " is not prime number");
					flag=false;
					break; 
				}
			}if(flag==true)
				System.out.println(num+ " is a prime number");
		}
	}	
	public static void main(String[] args) {
		PrimeNumber primenumber= new PrimeNumber();
		primenumber.m1(50, 100);	
	}	
}
