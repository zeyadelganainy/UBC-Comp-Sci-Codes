import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		// Creates an object named "in" of the Scanner class
		
		System.out.print("Enter x1 and y1: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
		double distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) ); 	// Distance Formula 
		System.out.println("The distance between the two points is " + distance);
		
		in.close(); 		// Closes the scanner "in"
	}

}
