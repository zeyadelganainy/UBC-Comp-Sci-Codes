
public class Q1 {

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
	
	//Testing Q1
	System.out.println("The addition of the above two arrays is: ");
	Test.displayArray(addMatrix(m1,m2));	
	}
	
	public static int[][] addMatrix(int[][] a, int[][] b) {
		int[][] addedMatrix = new int[a.length][a[0].length];
		if(a.length == b.length && a[0].length == b[0].length) {
			for(int r = 0; r < a.length; r++)
				for(int c = 0; c < a[0].length; c++) 
					addedMatrix[r][c] = a[r][c] + b[r][c];
		}
		return addedMatrix;
	}
}
