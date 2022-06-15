import java.util.Scanner;
public class Q4 {

	public static boolean isValidPassword(String s) {
		if( s.length() < 8)
			return false;
		
		for (int i = 0; i < s.length(); i++) {
			if ( Character.isLetterOrDigit(s.charAt(i)) )
				return true;
		}
		int digits = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) 
				digits++;
		}
		if (digits > 2)
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		System.out.print(isValidPassword(password) ? "Valid" : "Invalid");
		input.close();
	}

}
