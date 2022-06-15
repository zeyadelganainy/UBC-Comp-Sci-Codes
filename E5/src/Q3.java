import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userInput = input.nextLine();
		
		//Reversing the string by printing the string from left to right
		System.out.print("The reversed string is: ");
		for( int i = userInput.length() ; i > 0 ; i-- ) {
			System.out.print(userInput.substring(i-1, i));
		}
		System.out.println(); 
		
		//Checking for vowels
		int vowels = 0;
		for( int i = 0; i < userInput.length(); i++) {
			switch(userInput.substring(i, i+1)) {
			case "A","E","I","O","U","a","e","i","o","u": vowels++; break;
			}
		}
		System.out.println("The number of vowels is " + vowels);
		
		//Checking for uppercase letters
		int uppercase = 0;
		for( int i = 0; i < userInput.length(); i++) {
			if ( Character.isUpperCase(userInput.charAt(i)) )
				uppercase++;
		}
		System.out.println("The number of uppercase letters is " + uppercase);
		input.close();
	}

}
