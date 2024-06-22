package basics;
// print count of character given in the String
public class StringExample6 {
	int m1(String input) {
		int count = 0;
		for (int num = 0; num < input.length(); num++) {
			char cha = input.charAt(num);
			if (cha == 't') {
				count++;	
			}		
		}System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		new StringExample6().m1("technocredits");
		

	}
}
