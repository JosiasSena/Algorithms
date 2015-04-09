/**
 * http://en.wikipedia.org/wiki/Bubble_sort
 * 
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting
 * algorithm that repeatedly steps through the list to be sorted, compares each
 * pair of adjacent items and swaps them if they are in the wrong order. The
 * pass through the list is repeated until no swaps are needed, which indicates
 * that the list is sorted. The algorithm, which is a comparison sort, is named
 * for the way smaller elements "bubble" to the top of the list. Although the
 * algorithm is simple, it is too slow and impractical for most problems even
 * when compared to insertion sort.[1] It can be practical if the input is
 * usually in sort order but may occasionally have some out-of-order elements
 * nearly in position.
 * 
 * @author josia_000
 * 
 */
public class BubbleSort {
	public static int[] nums = { 10, 9, 8, 5, 2, 6, 4, 7, 8, 5, 1, 2, 3, 6, 5,
			4, 7, 9, 5 };

	public static void main(String[] args) {
		System.out.print("Original array: ");
		printArray(nums);

		System.out.print("\nSorted array: ");
		bubbleSort(nums);
		printArray(nums);
	}

	public static void bubbleSort(int[] data) {

		for (int i = 0; i < data.length - 1; i++) {
			boolean isArraySorted = true;

			for (int j = 1; j < data.length - i; j++) {
				if (data[j] < data[j - 1]) {
					swapEm(j, j - 1);
					isArraySorted = false;
				}
			}

			if (isArraySorted) {
				break;
			}
		}
	}

	public static void printArray(int[] array) {
		System.out.print(" {");
		System.out.print("" + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.print("}");
	}

	public static void swapEm(int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
