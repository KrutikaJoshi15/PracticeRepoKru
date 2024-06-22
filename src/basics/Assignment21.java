package basics;

public class Assignment21 {
	
	void m1() {
		int num=6;
		int sum=0;
		int count =0;
		while(sum<=152) {			
			if (num%6==0) {
			sum= sum+num;
			count++;
			}	
			num++;
		}System.out.println(count);
	}
	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.m1();
	}
}
