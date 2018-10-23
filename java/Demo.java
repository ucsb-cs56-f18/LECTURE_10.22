public class Demo {

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void printArrayOf6(int [] nums) {
		System.out.print("[" + nums[0]);
		for (int i=1; i<6; i++) {
			System.out.print("," + nums[i]);
		}
		System.out.println("]");
	}

	public static void main(String [] args) {

		int [] nums = {2,3,5,54,2,89};

		System.out.print( "Before: ");
		printArrayOf6(nums);

		swap(nums[3],nums[4]);

		System.out.print( "After: ");
		printArrayOf6(nums);
	}

}
