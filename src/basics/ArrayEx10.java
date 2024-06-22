package basics;
//write a method which accepts String array and return char Array.
//return last character of each word.
public class ArrayEx10 {
	char[] display(String[] output) {
		char[] ch = new char[output.length];
		for(int num=0; num<output.length;num++) {
			ch[num]=output[num].toUpperCase().charAt(output[num].length()-1);		
		}	return ch;	
	}
	
	void lastCharacterOfWord(String [] str) {
		char[] ch=display(str);
		for(int n=0; n<ch.length; n++) {
		System.out.println(ch[n]);
		String stra = "I am good";
		}
	}
	
	public static void main(String[] args) {
		ArrayEx10 arrayEx10 = new ArrayEx10();
		String str= "Westside Clothes";
		String[] str1= str.split(" ");
		arrayEx10.lastCharacterOfWord(str1);
	}
}
