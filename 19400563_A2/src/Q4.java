import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);		// Creates an object of the Scanner class named "input"
		
		System.out.println("Enter three points for a triangle."); 
		
		//The sample run only showed integers, but there is a chance that the user enters a double value e.g. (1.5,2)
		//so the data type I'm assigning to the variables is  double
		
		System.out.print("(x1, y1): ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("(x2, y2): ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("(x2, y3): ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Using the distance formula from Q3 to find the length of the sides:
		double side1 = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) ); 
		double side2 = Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) );
		double side3 = Math.sqrt( Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2) );
		
		double s = ( side1 + side2 + side3 ) / 2; 					// Equation for "s" used in finding area below
		
		double area = Math.sqrt( s * (s - side1) * (s - side2) * (s - side3) ); //Equation of finding area using 3 sides
		
		System.out.println("The area of the triangle is " + area);
		
		input.close(); 			//Closes the scanner "input"
	}

}
