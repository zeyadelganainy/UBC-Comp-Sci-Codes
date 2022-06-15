import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int patternInt = input.nextInt();
		System.out.println();
		
		//Constructing Pattern I
		System.out.println("Pattern I");
		System.out.println("---------");
		//As a rule i (outer loop) is number of rows, j (inner loop) is number of columns
		for (int i = 1; i <= patternInt; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//Constructing Pattern II
		System.out.println("\nPattern II");
		System.out.println("-----------");
		//Only difference is that it's now descending instead of ascending (decrement) 
		for (int i = patternInt ; i > 0; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
