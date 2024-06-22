package basics;

import java.util.Arrays;
// find out the highest no in the given array
public class ArrayEx8 {
	
	public static void main(String[] args) {
		int[] arr= {10, 70, 30, 65, 50};		
		Arrays.sort(arr);	
		System.out.println(arr[arr.length-1]);
	}
}
