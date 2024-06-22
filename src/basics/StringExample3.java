package basics;
/*print given string in reverse order which will take 
character from user and also print how many times the character is been called
*/
public class StringExample3 {

	void m1(String input, char targetValue) {
		int count= 0;
		for(int n= input.length()-1; n>=0; n--) {
			System.out.println(input.charAt(n));
			char ch = input.charAt(n);
				if (ch == targetValue ) {
					count++;
				}
			}System.out.println(targetValue + "-->" + count);
		}
	
	public static void main(String[] args) {
		StringExample3 stringExample3 = new StringExample3();
		stringExample3.m1("Krutika is happy" , 'p');
	}
}
