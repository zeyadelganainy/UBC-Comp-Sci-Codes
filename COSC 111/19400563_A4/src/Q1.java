import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	   //Creates an object "input" of the class Scanner so we can use it to read user input

		System.out.print("Enter a letter: ");
		
		char letter = input.nextLine().charAt(0);	//Reads the next string from the user and takes its first value and assigns it to the character "letter"
		
		//Checking if "letter" contains an actual letter
		if( ( letter >= 'A' && letter <= 'Z' ) || (letter >= 'a' && letter <= 'z')) {
		//The following is a switch statement which takes the value of "letter" and compares it to the cases below and executes the ONLY statement for that particular case
		switch(letter) {
		case 'a','e','i','o','u','A','E','I','O','U': System.out.println(letter + " is a vowel"); break;
		default: System.out.println(letter + " is a constant");
		}
		}
		else
			System.out.println(letter + " is an invalid output");
		input.close(); 		//Closes the scanner "input"
		
	}

}
