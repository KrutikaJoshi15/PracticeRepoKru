package basics;
	
public class TryCatchEx1 {
	int div;
	void m1(int num1, int num2) {		
		try{
			div= num1/num2;
			System.out.println("division of two numbers is " + div);
		}catch(Exception e) {
			System.out.println(num1+ " cannot be divisible by " + num2);
		}
		
	}
	public static void main(String[] args) {
		TryCatchEx1 tryCatchEx1= new TryCatchEx1();
		tryCatchEx1.m1(20,20);
		tryCatchEx1.m1(20,0);
		tryCatchEx1.m1(60,20);
		
	}
}
