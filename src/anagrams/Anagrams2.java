package anagrams;

import java.io.IOException;

public class Anagrams2 {

	static String[] firstWords = { "cinema", "host", "aba", "train" };
	static String[] secondWords = { "iceman", "shot", "bab", "rain" };

	static int[] counter1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	static int[] counter2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public static void main(String[] args) throws IOException {
		check_anagrams(firstWords, secondWords);
	}

	public static void check_anagrams(String[] firstWords, String[] secondWords) {
		long startTime = System.nanoTime();

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

		System.out.println(System.nanoTime() - startTime + "");
	}
}
