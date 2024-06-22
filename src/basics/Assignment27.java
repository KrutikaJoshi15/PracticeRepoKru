package basics;
//Remove all uppercase characters from given String
public class Assignment27 {
	String m1(String input) {
		for(int num=0; num<input.length(); num++) {
			char ch= input.charAt(num);
			boolean flag=Character.isUpperCase(ch);
				if(flag==true) {
					input=input.replace(ch,'*');
				}
		}return input;
	}
	
	void display() {
		String str = m1("TeChnOcRedITs");
		str=str.replace(String.valueOf('*'), "");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.display();
	}
}
