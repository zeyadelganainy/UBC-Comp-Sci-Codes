import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//Creates a new Scanner object called input
		
		System.out.print("Enter v0, v1, and t: "); 
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = (v1 - v0) / t;					//Equation for finding average acceleration 
		System.out.println("The average acceleration is " + a);
		
		input.close(); 								// Closes the scanner named "input"
	}

}
