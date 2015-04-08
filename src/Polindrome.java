

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = 0;
		int numCopy = 0;
		int reverse = 0;

		System.out.print("Enter a Number to check if it is palindrome: ");
		number = scanner.nextInt();
		numCopy = number;

		while (numCopy > 0) {
			int digit = numCopy % 10;
			System.out.println("digit: " + digit);

			numCopy /= 10;
			System.out.println("numCopy: " + numCopy);

			reverse = (reverse * 10) + digit;
			System.out.println("reverse: " + reverse);

			System.out.println("====================================");
		}

		if (number == reverse) {
			System.out.println("The number " + number + " is a palindrome");
		} else {
			System.out.println("The number " + number + " is not a palindrome");
		}

	}

}
