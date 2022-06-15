import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		//Creates a new object "input" of the Scanner class
		
		System.out.print("Enter an integer between 0 and 1000: ");
		int givenInteger = input.nextInt(); //Since I explicitly asked for an integer number, I can safely use int data type
		
		//To solve this question, I will go back to the concept of ones,tens, and hundreds
		int ones = givenInteger % 10;											//Finding number of ones in givenInteger
		int tens = (( givenInteger - ones ) % 100) / 10 ;						//Finding number of tens in givenInteger
		int hundreds = (( givenInteger - ( tens + ones ) ) % 1000) / 100 ;		//Finding number of hundreds in givenInteger
		
		int sum = ones + tens + hundreds;
		System.out.printf("The sum of all digits in %d is %d" , givenInteger, sum);
		
		input.close(); 			//Closes the scanner
		
	}

}
