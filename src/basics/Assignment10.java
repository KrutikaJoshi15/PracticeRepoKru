package basics;
//print all even numbers on user defined range
public class Assignment10 {
	void evenNumbers(int startRange, int endRange){
		for(int n=startRange; n<=endRange; n++) {
			if(n%2==0) {
				System.out.println("even nos. are " + n);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.evenNumbers(10, 15);
	}
}
