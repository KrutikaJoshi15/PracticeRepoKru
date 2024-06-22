package basics;

public class StaticNonStaticExpl1 {

	void m1() {
		System.out.println("Hi");
		m2();
	}
	void m2() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		StaticNonStaticExpl1 staticNonStaticExpl1 = new StaticNonStaticExpl1();
		staticNonStaticExpl1.m1();
	}
}
