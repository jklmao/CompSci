package ComputerScience.me.chris.cs;

public class ArraySort {

	public static void main(String[] args) {

		int MATRIX[][] = new int[][] {

				{ 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		sort(MATRIX);

	}

	public static void sort(int m[][]) {

		
		// print before sort

		for (int i = 0; i < m.length; i++) {
		
			for (int k = 0; k < m[i].length; k++) {
				System.out.print(m[i][k] + " ");
			}
			
			System.out.println();

		}

		// organize

		
		
		
			for (int a = 0; a < m.length; a++) {
			
				int currentMin = m[a][0];
				int minIndex = a;
				
				/*
				 *       1   2
				 *       3   4
				 *       
				 *   currentMin = 1
				 *   index = 0;
				 */
				
				for (int b = a; b < m.length; b++) {
					
					if (currentMin > m[b][0] || currentMin == m[b][0] && m[minIndex][1] > m[b][1]) {
						
						currentMin = m[b][0];
						minIndex = b;
				
					}
				}
				
				if (minIndex != a) { 
				
					int temp1 = m[minIndex][0];
					int temp2 = m[minIndex][1];
					
					
					m[minIndex][0] = m[a][0];
					m[minIndex][1] = m[a][1];
					
					m[a][0] = temp1;
					m[a][1] = temp2;
					
					
				}
		}

		System.out.println();
		System.out.println();
		System.out.println();

		// print after sort

		for (int i = 0; i < m.length; i++) {

			for (int k = 0; k < m[i].length; k++) {
				System.out.print(m[i][k] + " ");

			}
			System.out.println();

		}

	}

}
