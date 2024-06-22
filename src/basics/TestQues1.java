package basics;

public class TestQues1 {
	
	
	void processData(int startRange, int endRange) {
		int sum=0;
		for(int num=startRange; num<=endRange; num++) {
			sum= sum+num;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		TestQues1 testQues1 = new TestQues1();
		testQues1.processData(1, 10);
		
		
				
	}
}
