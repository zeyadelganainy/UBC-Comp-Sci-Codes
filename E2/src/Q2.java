import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the amount of water (kg): ");
		double waterMassInKg = in.nextDouble();
		System.out.print("Enter the initial and final temperatures of the water (°C): ");
		
		double initialTemp = in.nextDouble();
		double finalTemp = in.nextDouble();
		
		double q = waterMassInKg * (finalTemp - initialTemp) * 4184;
		//System.out.println("The energy needed to change the temperature of " + waterMassInKg + " kg of water from " + initialTemp + " degrees Celsius to " + finalTemp + " degrees Celsius is: " + q); 
		System.out.println("The energy needed is: " + q + " joules.");
		in.close();
	}

}
