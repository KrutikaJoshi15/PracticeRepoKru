package basics;

public class SwitchEx1 {
	
	void displayDay(int num) {
		int day = num;
		switch(day) {
		case 1:
			System.out.println("It is Monday");
			break;
		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursday");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Satuarday");
			break;
		case 7:
			System.out.println("It is Sunday");
			break;
		default:
			System.out.println("Invalid input");		
		}
	}
	
	public static void main(String[] args) {
		SwitchEx1 switchEx1= new SwitchEx1();
		switchEx1.displayDay(3);
		switchEx1.displayDay(-1);
		switchEx1.displayDay(7);
		switchEx1.displayDay(9);
		
	}
}
