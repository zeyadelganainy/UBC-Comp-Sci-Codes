import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		//Creates an object "in" of the class Scanner
		
		System.out.print("Enter a real number: ");
		
		double realNum = in.nextDouble();		//Reads the next double value by the user and assigns it to "realNum"
		
		int intPart = (int) realNum / 1;        /*Here, i casted realNum to integer to be able to get integer division.
									    	Also, i cannot convert a double "realNum" to an integer intPart without casting */
											
		double fractionPart = realNum % 1;
		
		System.out.println("Integer part: " + intPart);
		System.out.println("Fraction part " + fractionPart);
		
		in.close();			//Closes the scanner "in"
		
	}

}
