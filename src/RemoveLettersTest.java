

import java.util.Scanner;

public class RemoveLettersTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scanner.nextLine();

		RemoveLetters(word);
	}

	static String RemoveLetters(String word) {

		if (word.length() == 0) {
			return word;
		}

		System.out.println(word);
		return RemoveLetters(word.substring(0, word.length() - 1));
	}

}
