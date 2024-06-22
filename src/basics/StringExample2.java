package basics;
//print given String in reverse order
public class StringExample2 {

	void m1(String input) {
		for(int n= input.length()-1; n>=0; n--) {
			System.out.println(input.charAt(n));			
		}
		
	}
	
	public static void main(String[] args) {
		StringExample2 stringExample2 = new StringExample2();
		stringExample2.m1("Krutika");
	}

}
