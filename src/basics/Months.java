package basics;

public class Months {
	
	void m1(int num) {
		if(num>=1 && num<=3) {
			System.out.println("Its Quarter1");
			
			if(num==1) {
				System.out.println("Its January");
			}
			else if(num==2) {
			System.out.println("Its February");
			}else {
				System.out.println("Its March");
			}
		}else {
			System.out.println("Invalid Input");
			}
	}


	void m2(int num) {
	if(num>=4 && num<=6) {
		System.out.println("Its Quarter2");
		
		if(num==4) {
			System.out.println("Its April");
		}
		else if(num==5) {
		System.out.println("Its May");
		}else {
			System.out.println("Its June");
		}
	}else {
		System.out.println("Invalid Input");
		}
}


	void m3(int num) {
	if(num>=7 && num<=9) {
		System.out.println("Its Quarter3");
		
		if(num==7) {
			System.out.println("Its July");
		}
		else if(num==8) {
		System.out.println("Its August");
		}else {
			System.out.println("Its September");
		}
	}else {
		System.out.println("Invalid Input");
		}
}

	void m4(int num) {
	if(num>=10 && num<=12) {
		System.out.println("Its Quarter4");
		
		if(num==10) {
			System.out.println("Its October");
		}
		else if(num==11) {
		System.out.println("Its November");
		}else {
			System.out.println("Its December");
		}
	}else {
		System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
	Months months = new Months();
	months.m1(1);
	months.m1(2);
	months.m1(3);
	months.m1(10);
	months.m2(4);
	months.m2(5);
	months.m2(6);
	months.m3(7);
	months.m3(8);
	months.m3(9);
	months.m4(10);
	months.m4(11);
	months.m4(12);
	months.m4(13);
	}
}



	
