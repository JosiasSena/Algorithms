

import java.util.Random;
import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] coin = { "h", "t" };
		int computer = new Random().nextInt(2);

		System.out.print("Guess either 'h' for Heads and 't' for Tails: ");
		String guess = scanner.nextLine();

		if (!guess.equalsIgnoreCase("h") && !guess.equalsIgnoreCase("t")) {
			System.out.println("You entered " + guess
					+ ". That is an invalid option");
		} else {
			if ((guess.equalsIgnoreCase("h") || guess.equalsIgnoreCase("t"))
					&& (guess.equalsIgnoreCase(coin[computer]))) {
				System.out.println("You won");
			} else {
				System.out.println("You lost.");
			}
		}
	}
}