package basics;
// sum of odd numbers in the given range
public class OddNumbers {
	void getOddNumber(int startRange, int endRange) {
		int sum=0;
		for(int num=startRange; num<=endRange; num++) {
			if(num%2!=0) {
				sum=sum+num;
			}
		}	System.out.println(" Sum of odd number " + sum);	
	}
	
	public static void main(String[] args) {
		OddNumbers oddNumbers= new OddNumbers();
		oddNumbers.getOddNumber(1,50);
	}
}
