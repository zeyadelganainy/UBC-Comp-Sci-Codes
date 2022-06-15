
public class Q1 {
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
		if(equals(m1,m2))
			System.out.println("The arrays are strictly identical");
		else
			System.out.println("The arrays aren't strictly identical");
		
		}
		
		public static void displayArray(int[][] m) {
			for (int r = 0; r < m.length; r++) {
				for (int c = 0; c < m[r].length; c++)
					System.out.print(m[r][c] + " ");
				System.out.println();
			}
		}
		
		public static boolean equals(int[][] m1, int[][] m2) {
			if(m1.length == m2.length && m1[0].length == m2[0].length )
			for(int r = 0; r < m1.length; r++)
				for(int c = 0; c < m1[r].length; c++) {
					if(m1[r][c] == m2[r][c])
						return true;
				}
			return false;
		}
}
