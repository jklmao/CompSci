package ComputerScience.me.chris.cs;

public class ArraySort {

	public static void main(String[] args) {

		int MATRIX[][] = new int[][] { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		sort(MATRIX);

	}

	public static void sort(int ARRAY[][]) {

		// print before sort

		for (int i = 0; i < ARRAY.length; i++) {

			for (int k = 0; k < ARRAY[i].length; k++) {
				System.out.print(ARRAY[i][k] + " ");
			}

			System.out.println();

		}

		// Sort

		for (int i = 0; i < ARRAY.length; i++) {

			int currentMin = ARRAY[i][0];

			// Output for clarity
			System.out.println();
			System.out.println("Current min: " + currentMin);

			int minIndex = i;

			for (int j = i; j < ARRAY.length; j++) {

				// First part of if statement: Checking whether the first number in the array is
				// greater or equal to the second number
				// Second part of if statement: Checking whether the second number in the array
				// is greater than the next number
				System.out.println();
				System.out.println("Comparing: " + currentMin + " with " + ARRAY[j][0]);
				System.out.println("Comparing: " + ARRAY[minIndex][1] + " with " + ARRAY[j][1]);
				System.out.println();

				if (currentMin > ARRAY[j][0] || currentMin == ARRAY[j][0] && ARRAY[minIndex][1] > ARRAY[j][1]) {

					// If so, then the minIndex becomes the row number in the array
					// And then currentMin changes into the row number number in the array
					System.out.println("currentMinimum = " + ARRAY[j][0] + " " + ARRAY[j][1]);

					System.out.println();
					minIndex = j;
					currentMin = ARRAY[j][0];

				}

			}
			if (minIndex != i) {
				// Switching
				int temp1 = ARRAY[minIndex][0];
				int temp2 = ARRAY[minIndex][1];

				ARRAY[minIndex][0] = ARRAY[i][0];
				ARRAY[minIndex][1] = ARRAY[i][1];

				ARRAY[i][0] = temp1;
				ARRAY[i][1] = temp2;
			}

		}

		System.out.println();
		System.out.println();
		System.out.println();

		// print after sort

		for (int i = 0; i < ARRAY.length; i++) {

			for (int k = 0; k < ARRAY[i].length; k++) {
				System.out.print(ARRAY[i][k] + " ");

			}
			System.out.println();

		}

	}

}
