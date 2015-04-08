package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int num = new Scanner(System.in).nextInt();

		System.out.print("Fibonacci series for " + num + " numbers: ");
		for (int i = 1; i <= num; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {

			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}
}
