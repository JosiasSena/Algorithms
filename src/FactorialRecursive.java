

import java.util.Scanner;

public class FactorialRecursive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("Enter a number to get the factorial of: ");
		number = scanner.nextInt();
		System.out
				.println("The factorial of " + number + " is " + fact(number));

	}

	static int fact(int number) {
		int result;
		if (number == 0 || number == 1) {
			return 1;
		}

		return fact(number - 1) * number;
	}

}
