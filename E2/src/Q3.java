import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter your weight (lbs): ");
		double weightLbs = reader.nextDouble();
		double weightKg = weightLbs * 0.45359237;
		
		System.out.print("Enter your height (in): ");
		double heightInch = reader.nextDouble();
		double heightM = heightInch * 0.0254;
		
		double bmi = weightKg / Math.pow(heightM, 2);
		System.out.println("Your BMI is: " + bmi);
		
		reader.close();
	}

}
