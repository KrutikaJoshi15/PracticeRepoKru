package basics;
//print sum of all prime numbers between the given range
public class PrimeNumberExample2 {
	void m1(int startRange, int endRange) {
		int n=0;
		for(int num=startRange; num<=endRange; num++) {
			boolean flag= true;
			for(int index=2; index<num-1; index++) {
				if(num%index==0) {
					//System.out.println(num + " is not prime number");
					flag=false;
					break; 
				}
			}if(flag==true) {
				n=n+num;
			}
				
		}System.out.println("Sum of all prime numbers between the given range is "+ n);
	}	
	public static void main(String[] args) {
		PrimeNumberExample2 primeNumberExample2= new PrimeNumberExample2();
		primeNumberExample2.m1(50, 100);	
	}	
}
