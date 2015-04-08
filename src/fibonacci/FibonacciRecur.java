package fibonacci;

import java.util.Scanner;

public class FibonacciRecur {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.print("Fibonacci Series: ");

		for (int i = 0; i < number; i++) {
			System.out.print(fibo(i) + " ");
		}

	}

	static int fibo(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}

		return fibo(number - 1) + fibo(number - 2);
	}
}
