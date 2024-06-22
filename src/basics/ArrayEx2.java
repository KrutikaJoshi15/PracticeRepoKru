package basics;
// passing array as a method parameter
public class ArrayEx2 {
	void display(int[] nums) {
		for(int n=0; n<nums.length; n++) {
			System.out.println(nums[n]);
		}		
	}
	
	public static void main(String[] args) {
		ArrayEx2 arrayEx2 = new ArrayEx2();
		int[] arr = {10, 20,30};
		arrayEx2.display(arr);
	}
}
