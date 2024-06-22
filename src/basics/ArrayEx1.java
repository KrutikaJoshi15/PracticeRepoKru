package basics;
//print all elements of array
public class ArrayEx1 {
	
	void display() {
		int[] num= {20, 30, 40};
		int len=num.length;
		for(int n=0; n<num.length; n++) {
			System.out.println(num[n]);
		}
}
	public static void main(String[] args) {
		ArrayEx1 arrayEx1 = new ArrayEx1();
		arrayEx1.display();
		
	}
}
