package basics;
//Remove all the vowels from the given String
public class Assignment26 {
	String m1(String input) {
		for(int n=0; n<input.length(); n++) {
			char ch=input.charAt(n);
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u') {
				input=input.replace(ch, '*');
			}			
		}return input;
	}
	
	void display() {
		String str =m1("technocredits");
		str= str.replace(String.valueOf('*'), "");
		System.out.println(str);
		
	}
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.display();		
	}
}
