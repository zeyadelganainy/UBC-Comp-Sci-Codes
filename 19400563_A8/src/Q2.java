
public class Q2 {

	public static void main(String[] args) {
		int[][] m1 = { { 14, 11, 13, 12 },
				       { 18, 15, 13, 13 },
				       { 19, 16, 15, 17 } };
	
		int[][] m2 = { { 54, 53, 51, 52 },
			           { 51, 59, 52, 56 },
		               { 53, 54, 52, 58 } };
	
	System.out.println("First array:");
	Test.displayArray(m1);
	System.out.println("Second array:");
	Test.displayArray(m2);
	
	System.out.println();	//Separator
	
	//Testing Q2
	System.out.println("The sum of the first column in the first array is: " + sumCol(m1,0));

	}
	public static int sumCol(int[][] m, int colIdx) {
		int sum = 0;
		for( int r = 0; r < m.length; r++)
			sum += m[r][colIdx];
		return sum;
	}
}
