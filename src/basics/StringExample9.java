package basics;
//WAP to remove all the occurrences of given characters from the String
public class StringExample9 {
	void m1(String input, char ch) {
		input= input.replace(String.valueOf(ch), "");
		System.out.println(input);
	}
	public static void mains(String[] args) {
		StringExample9 stringExample9 = new StringExample9();
		stringExample9.m1("technocredits", 't');
	}
}
