import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 	//Creates an object named input of the Scanner class
		
		System.out.print("Enter the driving distance in miles: ");
		double distanceMiles = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		
		System.out.print("Enter price in $ per gallon: ");
		double price = input.nextDouble();
		
		double costOfTrip = (distanceMiles / mpg) * price;	//Equation for finding the cost of the trip
		System.out.println("The cost of driving is " + costOfTrip);
		
		input.close(); 				//Closes the scanner "input"
		
		

	}

}
