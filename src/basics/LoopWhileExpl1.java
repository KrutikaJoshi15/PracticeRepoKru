package basics;
//sum of nos till sum is equal or greater than 50.
public class LoopWhileExpl1 {
	
	void m1() {
		int sum=1;
		int num=1;
		while(sum<=51) {
		sum= sum+num;	
			num++;
		}System.out.println(num);
	}
	
	public static void main(String[] args) {
		LoopWhileExpl1 loopWhileExpl1 = new LoopWhileExpl1();
		loopWhileExpl1.m1();
	}
}
