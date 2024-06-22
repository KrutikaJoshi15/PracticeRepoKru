package basics;

public class WeekDisplay {
	
	void m1(int num) {
		if(num>=1 && num<=5) {
			System.out.println("Its a weekday");
			
			if(num==1) {
				System.out.println("Its a Monday");
			}
			else if(num==2) {
			System.out.println("Its Tuesday");
			}else if(num==3) {
			System.out.println("Its Wednesday");
			}else if(num==4) {
			System.out.println("Its Thursday");
			}else {
			System.out.println("Its Friday");
			}
		}else {
			System.out.println("Invalid Input");
			}
	}
	
	void m2(int num) {
		
		if (num==6 || num==7) {
			System.out.println("Its a weekend");
			
				if(num==6) {
					System.out.println("Its Satuarday");
				}else {
					System.out.println("Its Sunday");
				}
		}else {
			System.out.println("Invalid Input");
		}
		
	}
	
	public static void main(String[] args) {
		WeekDisplay weekDisplay = new WeekDisplay();
		weekDisplay.m1(1);
		weekDisplay.m1(2);
		weekDisplay.m1(3);
		weekDisplay.m1(4);
		weekDisplay.m1(5);
		weekDisplay.m1(0);
		weekDisplay.m2(6);
		weekDisplay.m2(7);
	}
}
