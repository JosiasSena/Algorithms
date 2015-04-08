

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string to reverse: ");
		original = scanner.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		System.out.println("The reversed string is: " + reverse);

	}
}
