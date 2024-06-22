package basics;

public class SwitchEx2 {
	void displayMonth(int num) {
		int month= num;
		switch(month) {
		case 1:
			System.out.println("Month "+ month+" is in Quarter 1");
			System.out.println(month + " is January");
			break;
		case 2:
			System.out.println("Month "+ month+" is in Quarter 1");
			System.out.println(month + " is February");
			break;
		case 3:
			System.out.println("Month "+ month+" is in Quarter 1");
			System.out.println(month + " is March");
			break;
		case 4:
			System.out.println("Month "+ month+" is in Quarter 2");
			System.out.println(month + " is April");
			break;
		case 5:
			System.out.println("Month "+ month+" is in Quarter 2");
			System.out.println(month + " is May");
			break;
		case 6:
			System.out.println("Month "+ month+" is in Quarter 2");
			System.out.println(month + " is June");
			break;
		case 7:
			System.out.println("Month "+ month+" is in Quarter 3");
			System.out.println(month + " is July");
			break;
		case 8:
			System.out.println("Month "+ month+" is in Quarter 3");
			System.out.println(month + " is August");
			break;
		case 9:
			System.out.println("Month "+ month+" is in Quarter 3");
			System.out.println(month + " is September");
			break;
		case 10:
			System.out.println("Month "+ month+" is in Quarter 4");
			System.out.println(month + " is October");
			break;
		case 11:
			System.out.println("Month "+ month+" is in Quarter 4");
			System.out.println(month + " is November");
			break;
			
		case 12:
			System.out.println("Month "+ month+" is in Quarter 4");
			System.out.println(month + " is December");
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}		
	}
	
	public static void main(String[] args) {
		SwitchEx2 switchEx2= new SwitchEx2();
		switchEx2.displayMonth(0);
		switchEx2.displayMonth(3);
		switchEx2.displayMonth(5);
		switchEx2.displayMonth(7);
		switchEx2.displayMonth(9);
		switchEx2.displayMonth(12);
		switchEx2.displayMonth(13);
	}
}
