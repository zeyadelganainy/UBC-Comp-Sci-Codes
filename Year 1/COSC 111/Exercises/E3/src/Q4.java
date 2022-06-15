import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		s = s.toUpperCase();
		int length = s.length();
		char firstChar = s.charAt(0);
		int checkX = s.indexOf("X");
		
		System.out.printf("The length of %s is %d \n" , s, length);
		System.out.printf("The first character in %s is %s \n", s, firstChar);
		System.out.printf("Does %s include the letter \"X\" (-ve value for NO, +ve value for YES)? %d" , s, checkX);
		
		in.close();

	}

}
