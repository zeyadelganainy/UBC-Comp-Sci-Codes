import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);			//Creates a new object "input" of the Scanner class
		
		//Creating random capital letters
		char firstLetter = (char) ( 65 + (int)( Math.random() * 26) );
		char secondLetter = (char) ( 65 + (int)( Math.random() * 26) );
		char thirdLetter = (char) ( 65 + (int)( Math.random() * 26) );
		
		//Creating random numbers from 0 to 9
		int firstNumber = (int) (Math.random() * 10);
		int secondNumber = (int) (Math.random() * 10);
		int thirdNumber = (int) (Math.random() * 10);
		int fourthNumber = (int) (Math.random() * 10);
		
		System.out.printf("A random vehicle plate number: %c%c%c%d%d%d%d", firstLetter, secondLetter, thirdLetter, firstNumber, secondNumber, thirdNumber, fourthNumber );
		
		input.close();  			//Closes the "input" scanner
	}

}
