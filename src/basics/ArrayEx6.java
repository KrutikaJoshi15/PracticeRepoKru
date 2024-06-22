package basics;
// find out the highest no in the given array
public class ArrayEx6 {
	int display(int[] nums) {
		int max= 0;
		for(int n=0; n<nums.length; n++) {
			int num1=nums[n];
			if(num1>max) {
				max=num1;
			}
		}return max;
	}
	
	public static void main(String[] args) {
		ArrayEx6 arrayEx6 = new ArrayEx6();
		int[] arr= {10, 70, 30, 65, 50};
		int max1=arrayEx6.display(arr);
		System.out.println("highest element in the array is " + max1);
		
	}
}
