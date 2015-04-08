import java.util.Scanner;

/**
 * Checks if a number is or is not prime
 */
public class IsPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		if (isPrime(num)) {
			System.out.println(num + " is a prime number!");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

	public static boolean isPrime(int input) {
		if (input % 2 == 0) {
			return false;
		}

		for (int i = 3; i * i <= input; i += 2) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
}
