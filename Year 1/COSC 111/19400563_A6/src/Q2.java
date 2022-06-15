import java.util.Scanner;
public class Q2 {
	
	public static boolean isValid(double side1, double side2, double side3) {
		
		//If statement that returns true if the sum of any two sides is greater than the 3rd and false otherwise
		if( side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
			return true;
		else
			return false;
	}

	public static double area(double side1, double side2, double side3) {
		//Using the equations given in Q2 to find the s and area:
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);			//Creates a scanner named "input"
		
		System.out.print("Enter three sides in double: ");
		
		//Taking the 3 sides as input and storing them in s1, s2, and s3 respectively
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		//Checks if input is invalid, then asks the user to try again
		while (!isValid(s1,s2,s3)) {
			System.out.println("Invalid Input. Try again.");
			System.out.print("Enter three sides in double: ");
			s1 = input.nextDouble();
			s2 = input.nextDouble();
			s3 = input.nextDouble();
		}
		//If the input is valid, call the area() method and use it in printing the area
		if (isValid(s1,s2,s3))
			System.out.printf("Area: %.3f" ,area(s1,s2,s3));
		
		input.close(); //Close the scanner
	}

}
