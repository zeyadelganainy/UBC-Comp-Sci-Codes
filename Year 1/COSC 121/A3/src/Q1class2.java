import java.util.Scanner;

public class Q1class2 {

	/*
	 * This class will use exception handling to handle exceptions by using a
	 * try..catch statement to check if the index value is out of bound and then
	 * displaying an error message if it is
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}

		System.out.print("Enter an index: ");
		int index = in.nextInt();
		while (index >= 50 || index < 0) {
			try {
				System.out.println(arr[index]);
			} catch (IndexOutOfBoundsException e) {
				System.out.print("Out Of Bound. Try again: ");
				index = in.nextInt();
			}
		}
		System.out.println("The element is " + arr[index]);

		in.close();
	}

}
