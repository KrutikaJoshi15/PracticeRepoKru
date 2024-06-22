package basics;
// print unique characters from given String
public class StringExample5 {
	void m1(String input) {
		for (int num = 0; num < input.length(); num++) {
			char ch = input.charAt(num);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		new StringExample5().m1("technocredits");
	}
}
