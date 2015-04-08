

public class BigONotation {

	boolean IsFirstElementNull(String[] strings) {
		if (strings[0] == null) {
			return true;
		}
		return false;
	}

	boolean ContainsValue(String[] strings, String value) {
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == value) {
				return true;
			}
		}
		return false;
	}

	boolean ContainsDuplicates(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (i == j) // Don't compare with self
				{
					continue;
				}

				if (strings[i] == strings[j]) {
					return true;
				}
			}
		}
		return false;
	}

	int CompareSmallestNumber(int array[]) {
		int x, curMin;

		// set smallest value to first item in array
		curMin = array[0];

		/*
		 * iterate through array to find smallest value and also assume there
		 * are only 10 elements
		 */
		for (x = 1; x < 10; x++) {
			if (array[x] < curMin) {
				curMin = array[x];
			}
		}

		// return smallest value in the array
		return curMin;
	}
}
