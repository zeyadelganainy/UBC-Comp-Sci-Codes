
public class Q2 {

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
		shuffle(m1);
		System.out.println("First array after shuffling: ");
		displayArray(m1);

	}
	public static void displayArray(int[][] m) {
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
	
	public static void shuffle(int[][] m) {
		for(int r = 0; r < m.length; r++) {
			int randomIdx = (int) (Math.random() *m.length);
			int[] temp = m[r];
			m[r] = m[randomIdx];
			m[randomIdx] = temp;
		}
	}
}
