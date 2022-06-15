import java.util.Scanner;

public class Q3 {
	static int count = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		System.out.print("Enter a character: ");
		char c = in.nextLine().charAt(0);
		System.out.printf("%c appears %d time(s) in \"%s\"", c, numOfTimes(s, c), s);
		in.close();
	}

	public static int numOfTimes(String s, char c, int n) {
		/*
		 * Base case: n is larger than the allowed index (length of string - 1)
		 * Recursive call: if the current character is c, increment count, repeat with the next character
		 */
		if (n <= s.length() - 1) {
			if (s.charAt(n) == c)
				count++;
			numOfTimes(s, c, n + 1);
		}
		return count;
	}

	public static int numOfTimes(String s, char c) {
		return numOfTimes(s, c, 0);
	}

}
