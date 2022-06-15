import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//Creates a new object "input" of the Scanner class
		
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temp = input.nextDouble();		//Reads a double value from the user and assigns it to "temp"
		
		System.out.print("Enter the wind speed in miles per hour (must be greater than or equal to 2) : ");
		double speed = input.nextDouble();		//Reads a double value from the user and assigns it to "speed"
		
		//Creating the formula for finding the wind-chill temperature
		double windChillTemp = 35.74 +  0.6215 * temp  - 35.75 * Math.pow(speed, 0.16) +  0.4275 * temp * Math.pow(speed, 0.16);
		
		System.out.println("The wind chill index is " + windChillTemp);
		
		input.close(); 			//Closes the scanner "input"
	}

}
