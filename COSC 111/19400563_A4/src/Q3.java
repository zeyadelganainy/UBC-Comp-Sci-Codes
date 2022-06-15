import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		//Creates a new scanner called "in"
		
		System.out.print("Enter three edges (length in double): ");
		
		//Reading the numbers entered by the user and assigned each one to a separate double variable
		double edge1 = in.nextDouble();
		double edge2 = in.nextDouble();
		double edge3 = in.nextDouble();
		
		//Checking if all numbers are positive and if the sum of any two out of the three sides is greater than the remaining side.
		boolean lengthCheck = ( (edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge1 + edge3 > edge2) );
		boolean isPositive = ( edge1 > 0 && edge2 > 0 && edge3 > 0);
		
		if(isPositive && lengthCheck) {
			double perimeter = edge1 + edge2 + edge3;		//Equation of perimeter
			System.out.println("The perimeter is " + perimeter);
		}
		else
			System.out.println("Input is invalid");
		
		in.close();		//Closes scanner
	}

}
