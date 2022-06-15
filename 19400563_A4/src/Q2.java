import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	//Creates a new scanner named "in"
		
		System.out.print("Enter a valid plate number: ");
		String plateNumber = in.nextLine();		//Reads the next string and stores it in string "plateNumber"
		while(plateNumber.length() >=5) {
			boolean correctLength = plateNumber.length() == 5;	
		
		//Extracting the elements of "plateNumber" to work on their conditions individually 
		char letter1 = plateNumber.charAt(0);
		char letter2 = plateNumber.charAt(1);
		char num1 = plateNumber.charAt(3);
		char num2 = plateNumber.charAt(4);
		
		//Forming and evaluating the conditions for the plate number validity
		//Checks if there are exactly 5 characters in plateNumber
		boolean dashInPlace = plateNumber.charAt(2) == '-';		//Checks if there's a dash at the correct place for it (index 2)
		boolean letters = ( ('A' <= letter1 && letter1 <= 'Z') && ('A' <= letter2 && letter2 <= 'Z') );	//Checks if letter1 and letter2 are valid upper-case letters
		boolean numbers = ( ('0' <= num1 && num1 <= '9') && ('0' <= num2 && num2 <= '9') );	//Checks if num1 and num2 are valid numbers
		
		if( correctLength && dashInPlace && letters && numbers ) //If all above conditions are true, do the following:
			System.out.println(plateNumber + " is a valid plate number");
		else //if not, do this instead
			System.out.println(plateNumber + " is an invalid plate number");
		
		in.close(); //Closes the scanner
		}
	}

}
