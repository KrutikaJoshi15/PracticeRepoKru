package basics;
//[10, -12, 6, -3, -33, 44, 4]
public class ArrayEx11 {
	
	int[] getPositiveNumbers(int [] num1) {
		int[] n= new int[num1.length];
		for(int index= 0; index<num1.length; index++) {
			if(num1[index]>0) {
				n[index]=num1[index];
				
			}
		}return n;
	}
	
	public static void main(String[] args) {
		ArrayEx11 arrayEx11= new ArrayEx11();
		int[] arr= {10, -12, 6, -3, -33, 44, 4};
		int[] output=arrayEx11.getPositiveNumbers(arr);
		System.out.println(output[4]);
		 String str= "abcde";
		 str=str.substring(0, 3);
		 System.out.println(str);
	}
}
