public class Demo1 {

	public static void swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}

	public static void printArrayOf6(Integer [] nums) {
		System.out.print("[" + nums[0]);
		for (int i=1; i<6; i++) {
			System.out.print("," + nums[i]);
		}
		System.out.println("]");
	}

	public static void main(String [] args) {

		Integer[] nums = {2,3,5,54,2,89};

		System.out.print( "Before: ");
		printArrayOf6(nums);

		swap(nums[3],nums[4]);

		System.out.print( "After: ");
		printArrayOf6(nums);
	}

}
