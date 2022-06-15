import java.util.Scanner;

public class Q1class1 {
	/*
	 * This class will use defensive programming to handle exceptions by using an if
	 * statement to check the index value and make sure it is acceptable (0-49) and
	 * then displaying an error message if it isn't
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}

		System.out.print("Enter an index: ");
		int index = in.nextInt();
		while (index < 0 || index >= 50) {
			System.out.print("Out of bound. Try again: ");
			index = in.nextInt();
		}
		System.out.println("The element is " + arr[index]);

		in.close();
	}

}
