package basics;
//print all characters of the given String
public class StringExample1 {
	
	void m1(String input) {
		for(int n= 0; n<input.length(); n++) {
			System.out.println(input.charAt(n));			
		}
		
	}
	
	public static void main(String[] args) {
		StringExample1 stringExample1 = new StringExample1();
		stringExample1.m1("Krutika is happy");
	}

}
