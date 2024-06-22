package basics;

public class Assignment22 {

	void m1(String input) {
		int count =0;
		for (int num=0; num<input.length(); num++) {
			char ch=input.charAt(num);
		    if (Character.isDigit(ch)== true) {
		    	count++;
		    }		    		 	
		}	System.out.println(count);	
	}
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.m1("te3c3hn5o2cre3dits");
	}
}
