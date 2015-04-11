public class SumRecursive {

	public static void main(String[] args) {

		int[] nums = { 1, 2 };
		System.out.println(sum(nums, nums.length - 1));
	}

	public static int sum(int[] nums, int length) {
		if (length == 0) {
			return nums[length];
		} else if (length < 0) {
			return 0;
		} else {
			return nums[length] + sum(nums, length - 1);
		}
	}
}
