package basics;

public class StringExample4 {
	int count= 0;
	int m1(String input, char character) {
	String str	=input.toLowerCase();
		for(int n=0; n< str.length(); n++) {
			char ch= str.charAt(n);
			if(ch == character) {
			count++;			
			}			
		} System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		StringExample4 stringExample4 = new StringExample4();
		stringExample4.m1("Technocredits Teaching", 't');
		
	}
}
