

public class ArrayOperations {

	public static void main(String[] args) {
		int[] myInts = { 1, 2, 16, 4, 20, 6, 7, 50, 9, 10 };

		// Print all array elements
		System.out.println("Printing all array elements.");
		System.out.print("myInts: ");
		for (int i = 0; i < myInts.length; i++) {
			System.out.print(myInts[i] + " ");
		}
		System.out.println("\n");

		// Adding all elements
		System.out.println("Adding all array elements.");

		int sum = 0;
		for (int i = 0; i < myInts.length; i++) {
			sum += myInts[i];
		}
		System.out.println("" + sum);

		// Finding the largest element in array
		System.out.println("\nPrinting out the largest element in the array");
		int max = myInts[0];
		for (int i = 1; i < myInts.length; i++) {
			if (myInts[i] > max) {
				max = myInts[i];
			}
		}
		System.out.println("The largest number is: " + max);
	}
}
