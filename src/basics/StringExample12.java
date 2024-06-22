package basics;
//print highest occurring character in given String
public class StringExample12 {
	 int m1(String input, char targetCh) {
		 int count= 0;
		 for(int num=0; num<input.length(); num++) {
			 char ch= input.charAt(num);
			 if(ch==targetCh) {
				count++; 
			 }
		 }return count;
	 }
		
	 void countDisplay() {
		 int max= 0;
		 String finChar = "";
		 String str= "tecchnocredits";
		 for(int n=0; n<str.length(); n++) {
			 char ch1= str.charAt(n);
			int count1 =m1(str, ch1);
			if (count1>max) {
				max=count1;
				finChar=str.valueOf(ch1);			
			}
		 }
		 if(max==1) {
			 System.out.println("String has all the unique characters");
		 }else
		 System.out.println(finChar + " : "+ max);
	 }
	
	 public static void main(String[] args) {
		 StringExample12 stringExample12= new StringExample12();
		 stringExample12.countDisplay();
	}
}
