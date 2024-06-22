package basics;

public class CharacterExample2 {
	int m1(String input) {
		int n =0;
		for(int num=0; num<input.length(); num++) {
			char ch= input.charAt(num);
				boolean flag= Character.isDigit(ch);
					if(flag==true) {
						n= n + Character.getNumericValue(ch);
					}
		}return n;
	}
	public static void main(String[] args) {
		CharacterExample2 characterExample2= new CharacterExample2();
		int n1=characterExample2.m1("te3chn9cre6d1t5");
		System.out.println(n1);
	}
}
