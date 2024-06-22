package basics;

public class Assignment4 {
	String firstName;
	String lastName;
	String companyName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	void setOtherInfo(String cName, String cityName, int pin) {
		companyName = cName;
		city=cityName;
		pincode=pin;
	}	

	void printAllDetails() {
		System.out.println("Employee first name is " + firstName );
		System.out.println("Employee last name is " + lastName );
		System.out.println("Employee company name is " + companyName );
		System.out.println("Employee city is " + city );
		System.out.println("Employee pincode is " + pincode );
	}
	
	public static void main(String[] args) {
		Assignment4 assignment4 = new Assignment4();
		assignment4.setPrimaryInfo("techno", "credits");
		assignment4.setOtherInfo("ptc", "Pune", 411045);
		assignment4.printAllDetails();
	}
}
