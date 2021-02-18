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

	public static int[] countLetters(char[] chars) {

		int[] freqArray = new int[26];
		int[] visited = new int[26];

		for (int b = 0; b < chars.length; b++) { // To get the first character

			for (int c = 0; c < chars.length; c++) { // To loop through the rest of the array's characters
													 
				int charint = (int) chars[c]; // Get the Character in integer form
				int index = charint - 97; // Get the index to put into the array

				if (chars[c] == chars[b] && visited[index] != -1) { 
				// Checks if the characters are the same
				// Also checks if the character has been visited

					visited[index] = -1; // Because it's been visited, other character get set to -1
					freqArray[index]++; // Increment the freqArray

				}

			}

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
