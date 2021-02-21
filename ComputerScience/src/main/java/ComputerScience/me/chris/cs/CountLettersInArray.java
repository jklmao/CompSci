package ComputerScience.me.chris.cs;

public class CountLettersInArray {

	RandomCharacter rc;

	public CountLettersInArray(RandomCharacter random) {
		rc = random;
	}

	public static void main(String[] args) {
		// Declare and create an array
		char[] chars = createArray();

		// Display the array
		System.out.println("The lowercase letters are:");
		displayArray(chars);

		// Count the occurrences of each letter
		int[] counts = countLetters(chars);

		// Display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}

	// Create an array of characters
	public static char[] createArray() {
		/// Declare an array of characters and create it
		char[] chars = new char[100];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		// Return the reference of the array
		return chars;
	}

	// Display the array of character
	public static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for (int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.println(chars[i]);
			} else {
				System.out.print(chars[i] + " ");
			}
		}
	}

	public static int[] countLetters(char[] chars) { // I overcomplicated it for no reason.

		int[] freqArray = new int[26];

		for (int x = 0; x < chars.length; x++) {

			int charint = chars[x];
			int index = charint - 97;

			freqArray[index]++;

		}

		return freqArray;

	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.println(counts[i] + " " + (char) (i + 'a'));
			} else {
				System.out.print(counts[i] + " " + (char) (i + 'a') + "  ");
			}
		}
	}

}
