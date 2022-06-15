import java.util.Scanner;
public class Q3 {

	public static int reverse(int number) {
			String num = number + "";		//concatenating "number" with an empty string to turn it to a string and store it in "num"
			String reversed = "";
			//Iterating through the string character by character in reverse order and printing them one by one
			for( int i = num.length(); i > 0; i--) {
				 reversed += num.charAt(i-1);
			}
			return Integer.parseInt(reversed);
		}
		
	public static boolean isPalindrome(int number) {
		//if statement that returns true if the number is equivalent to its reverse and false otherwise
		if(number == reverse(number)) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//Creates a new scanner object named "input"
		
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();					//Reads the next integer value in the scanner and assigns it to num
		
		if(isPalindrome(num))
			System.out.println(num + " is palindrome");
		else
			System.out.println(num + " is not palindrome");
		
		input.close(); 			//Closes the scanner
		
	}

}
