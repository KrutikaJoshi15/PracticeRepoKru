package basics;

public class Assignment20WhileLoop {
	void m1() {
		int n=2;	
		int count =0;
		
		do {
			System.out.println(n + " is even no");
			count++;
			if(count==5)
				break;
			n= n+2;
		}while(n%2==0);
	}
	
	public static void main(String[] args) {
		Assignment20WhileLoop assignment20WhileLoop = new Assignment20WhileLoop();
		assignment20WhileLoop.m1();
	}
}
