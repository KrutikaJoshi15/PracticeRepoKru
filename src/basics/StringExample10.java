package basics;
//Remove all vowels from the given String
public class StringExample10 {
	String m1(String input) {
 		for(int num=0; num<input.length(); num++) {
			char cha=input.charAt(num);	
			if(cha!='a' && cha!='e' && cha!='i' && cha!='o' && cha!='u') {
				System.out.print(cha);
			}
		}return input;
	}
	
	
	public static void main(String[] args) {
		StringExample10 stringExample10 = new StringExample10();
		stringExample10.m1("teoichncredits");
	}
}
