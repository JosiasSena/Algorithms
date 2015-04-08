import java.util.Scanner;

/**
 * Remove certain words from a sentence and replace them with an *
 */
public class RemoveProfanity {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your sentence: \n");
		String sentence = scanner.nextLine();

		// bad words = cat, dog, llama
		if (sentence.contains("cat") || sentence.contains("dog")
				|| sentence.contains("llama")) {
			System.out.print(sentence.replaceAll("(?i)(cat|dog|llama)", "*"));
		}
	}
}
