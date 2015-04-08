

public class CheckBrackets {

	static String[] input = { ")()[]", "[]({})", "([])", "{()[]}", "}}([)]" };

	public static void main(String[] args) {
		checkBRackets(input);
	}

	public static void checkBRackets(String[] input) {
		char[] openBrackets = { '(', '{', '[' };
		char[] closedBrackets = { ')', '}', ']' };

		for (int i = 0; i < input.length; i++) {
			String brackets = input[i];
			int openCounter = 0;
			int closeCounter = 0;

			// Check if it starts with a closing bracket or if it is odd
			if ((brackets.charAt(0) == closedBrackets[0])
					|| (brackets.charAt(0) == closedBrackets[1])
					|| (brackets.charAt(0) == closedBrackets[2])) {
				System.out.println(0);
			} else {
				for (int j = 0; j < brackets.length(); j++) {
					if ((brackets.charAt(j) == openBrackets[0])
							&& (brackets.charAt(j) == closedBrackets[0])) {
						openCounter++;
						closeCounter++;
					}
				}

				if (openCounter == closeCounter) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}

			// reset counters
			openCounter = 0;
			closeCounter = 0;
		}

	}
}
