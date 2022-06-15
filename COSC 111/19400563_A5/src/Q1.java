import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {

		//Declaring and initializing the values that will be used in the loops 
		int positiveIntegers = 0;
		int negativeIntegers = 0;
		int numberOfOdds = 0;
		int numberOfEvens = 0;
		int total = 0;
		double average = 0;
		double count = 0;	//count is double so that the average does not do integer division
		
		Scanner input = new Scanner(System.in); 		//Creates a scanner called "input"
		
		System.out.print("Enter the first integer (0 to terminate): ");
		int userInput = input.nextInt();		//Reads the next integer in the scanner and stores it in "userInput"
		
		if(userInput == 0)
			System.out.println("No numbers entered except " + userInput);
		else {
			while(userInput != 0) {
			
				total += userInput;		//Adds the userInput to the total 
			
				if (userInput > 0)	   //If the input is positive, increment positiveIntegers to eventually get number of positive integers
					positiveIntegers++;
				else				   //If not, then it must be negative (0 is out of the equation) so increment negativeIntegers
					negativeIntegers++;
			
				if(userInput % 2 == 0)	//If input/2 is a whole number, it's divisible by 2 (even) so increment numbersOfEvens
					numberOfEvens++;
				else
					numberOfOdds++;		//If there's a remainder (1), then it's a odd number, increment numberOfOdds to get their total count
			
				System.out.print("Enter the next integer (0 to terminate): ");
				userInput = input.nextInt();
				count++;
		}
		
			//Printing all the values
			System.out.println("The number of positives is " + positiveIntegers);
			System.out.println("The number of negatives is " + negativeIntegers);
			System.out.println("The number of evens is " + numberOfEvens);
			System.out.println("The number of odds is " + numberOfOdds);
			System.out.println("The total is " + total);
			average = total/count;
			System.out.printf("The average is %.2f", average);
		}
		input.close(); //Closes the scanner
	}

}
