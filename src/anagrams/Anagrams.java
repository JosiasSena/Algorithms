package anagrams;

import java.io.IOException;

/**
 * Finds out if the set of words in secondWords array is an anagram of the word
 * in the same position in the firstWords array
 * 
 * @author josia_000
 */
public class Anagrams {

	static String[] firstWords = { "cinema", "host", "aba", "train" };
	static String[] secondWords = { "iceman", "shot", "bab", "rain" };

	public static void main(String[] args) throws IOException {
		check_anagrams(firstWords, secondWords);
	}

	public static void check_anagrams(String[] firstWords, String[] secondWords) {
		int size = firstWords.length;

		int total = 0;
		int total2 = 0;

		for (int i = 0; i < size; i++) {
			char[] firstWord = firstWords[i].toCharArray();
			char[] secondWord = secondWords[i].toCharArray();

			for (int j = 0; j < firstWord.length; j++) {
				total += Integer.valueOf(firstWord[j]);
			}

			for (int j = 0; j < secondWord.length; j++) {
				total2 += Integer.valueOf(secondWord[j]);
			}

			if (total == total2) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}

			total = 0;
			total2 = 0;
		}
	}
}
