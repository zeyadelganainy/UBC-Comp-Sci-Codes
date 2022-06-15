import java.util.Arrays;
public class Q3 {

	public static void main(String[] args) {
		int[][] m1 = { { 14, 11, 13, 12 },
				   { 18, 15, 13, 13 },
				   { 19, 16, 15, 17 } };
	
		int[][] m2 = { { 54, 53, 51, 52 },
				   { 51, 59, 52, 56 },
	               { 53, 54, 52, 58 } };
		System.out.println("First array:");
		displayArray(m1);
		System.out.println("Second array:");
		displayArray(m2);
		System.out.println();
		System.out.println("First array after sorting each row: ");
		displayArray(sortRows(m1));

	}
	public static void displayArray(int[][] m) {
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
	public static int[][] sortRows(int [][] m) {
		int[][] sorted = new int[m.length][m[0].length];
		for(int r = 0; r < m.length; r++)
			for(int c = 0; c < m[0].length; c++)
				sorted[r][c] = m[r][c];
		
		for(int r = 0; r < m.length; r++) {
			Arrays.sort(sorted[r]);
		}
		return sorted;
	}
}
