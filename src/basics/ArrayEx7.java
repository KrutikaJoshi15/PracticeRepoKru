package basics;

// find out the lowest no in the given array
public class ArrayEx7 {
	public void minumNo(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
			min=arr[i];
		}
	}System.out.println("minimun no is : "+min);	
}

	public static void main(String[] args) {
		int[] arr= {50,80,30,90,40};
		ArrayEx7 arrayEx7=new ArrayEx7();
		arrayEx7.minumNo(arr);
	}
}
