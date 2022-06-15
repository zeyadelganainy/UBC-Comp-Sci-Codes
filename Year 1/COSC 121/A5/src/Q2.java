import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		System.out.println(reverse(s));
		in.close();
	}

	public static String reverse(String s, int n) {
		/*
		 * Base case: n is a negative number 
		 * Recursive call: adding the character at n to the character before that
		 */
		if (n >= 0)
			return s.charAt(n) + reverse(s, n - 1);
		else
			return "";
	}

	public static String reverse(String s) {
		return reverse(s, s.length() - 1);
	}
}
