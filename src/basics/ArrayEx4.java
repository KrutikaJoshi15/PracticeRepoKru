package basics;
// passing array as a method parameter
public class ArrayEx4 {
	void display(int[] nums) {
		nums[0]= 100;
		for(int n=0; n<nums.length; n++) {
			//System.out.println(nums[n]);
		}		
	}
	
	public static void main(String[] args) {
		ArrayEx4 arrayEx2 = new ArrayEx4();
		int[] arr = {10, 20,30};
		System.out.println(arr[0]);  //10
		arrayEx2.display(arr);
		System.out.println(arr[0]); //100
	}
}
