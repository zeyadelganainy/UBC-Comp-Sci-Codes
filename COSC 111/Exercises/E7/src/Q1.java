import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		double[] scores = new double[100];
		int count = 0;
		double sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a new score (-1 to end): ");
		double item = input.nextDouble();
		
		while (item >= 0) {
			scores[count] = item;
			count++;
			sum += item;
			System.out.print("Enter a new score (-1 to end): ");
			item = input.nextDouble();
			
		}
		
		double avg = sum / count;
		int aboveAVG = 0;
		for ( int i = 0; i < count; i++) {
			if(scores[i] >= avg)
				aboveAVG++;
		}
		System.out.printf("Average: %.2f\n" , avg);
		System.out.println("Total number of scores: " + count);
		System.out.println("Number of scores above or equal to the average: " + aboveAVG);
		System.out.println("Number of scores below the average: " + (count-aboveAVG));
	}	
}
	
