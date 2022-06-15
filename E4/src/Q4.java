import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the left corner point of the first rectangle (x1,y1): ");
			double R1x1 = input.nextDouble();
			double R1y1 = input.nextDouble();
			System.out.print("Enter the width and height for that rectangle (w,h): ");
			double R1x2 = R1x1 + input.nextDouble();
			double R1y2 = R1y1 - input.nextDouble();
			
			
			System.out.print("Enter the left corner point for the second rectangle (x2,y2): ");
			double R2x1 = input.nextDouble();
			double R2y1 = input.nextDouble();
			System.out.print("Enter the width and height for that rectangle (w,h): ");
			double R2x2 = R2x1 + input.nextDouble();
			double R2y2 = R2y1 - input.nextDouble();
			
			if( (R1x1 > R2x2 || R2x1 > R1x2) || (R1y2 > R2y1 || R2y2 > R1y1)) {
				System.out.println("The two rectangles do not overlap");
			}
			else 
				System.out.println("The two rectangles overlap");
			
			input.close();
			
			
	}

}
