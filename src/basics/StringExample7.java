package basics;
// print unique characters in the given String
public class StringExample7 {
	int m1(String input, char ch) {
		int count = 0;
		for (int num = 0; num < input.length(); num++) {
			char cha = input.charAt(num);
			if (cha == ch) {
				count++;	
			}		
		}
		return count;
	}
	
	void displayCount() {
		String str = "technocredits";
		for(int n=0; n<str.length(); n++) {
			char character= str.charAt(n);
			int countData= m1(str, character);
			if (countData==1) 
				System.out.print(character);	
		}			
								
	}

	public static void main(String[] args) {
		StringExample7 stringExample7=new StringExample7();
		//int count1= stringExample7.m1("technocredits", 't');
		//System.out.println(count1);
		stringExample7.displayCount();
		
	}		
}

