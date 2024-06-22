package basics;
//area of rectangle and perimeter of rectangle
public class Rectangle {
	int area;
	int perimeter;
	String name;
	
	int areaOfRectangle(int rectNo1, int length, int breadth) {
		area =length*breadth;
		return area;		
	} 
	
	void display(int rectNo, int len1, int bre1) {
		for(int num=1; num<=rectNo; num++) {
			int area1= areaOfRectangle(rectNo, len1, bre1);
			System.out.println("area of rectangle " + num + " is " + area1 );
		}
	}
	
	public static void main(String[] args) {
		Rectangle rectangle= new Rectangle();
		rectangle.display(3, 10, 20);
		
		
		
	}	
}
