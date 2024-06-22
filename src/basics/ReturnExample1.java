package basics;

public class ReturnExample1 {

	String name;
	
	String m1(int num) {
		if(num>10) {
			name = "Hi";
			return "techno";
		}else {
			name= "Hello";
			return "credits";
		}
	}
	
	int m2(String input) {
		if(input.length()>5) 
			return input.length();
			else
				return 0;
		}
	void display() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ReturnExample1 returnExample1 = new ReturnExample1();
		String ans = returnExample1.m1(13);
		int output = returnExample1.m2(ans);
		if (output<10) 
			returnExample1.display();
			else
				System.out.println("nothing to print");

	}
}
