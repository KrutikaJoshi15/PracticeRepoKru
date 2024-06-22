package basics;
// passing array as a method parameter
public class ArrayEx5 {
//	void display(int y) {
//		y=40;
//	}
//	
//	public static void main(String[] args) {
//		ArrayEx5 arrayEx2 = new ArrayEx5();
//		int x= 20;		
//		System.out.println(x);  //20
//		arrayEx2.display(x);
//		System.out.println(x); //20
//	}
	int display() {
		int count = 0;
		String str= "H2i H3eI4lo P4un2e5";
			for(int num= 0; num<str.length(); num++) {
				char ch= str.charAt(num);
				if(Character.isDigit(ch))
					count ++;
		 }return count;	
	}
	
	public static void main(String[] args) {
		ArrayEx5 arrayEx5= new ArrayEx5();
		int count=arrayEx5.display();
		System.out.println(count);
}
}
