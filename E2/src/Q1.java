import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What's your name? ");
		String name = input.nextLine();
		System.out.print("What is your birth year? ");
		int birthYear = input.nextInt();
		int age = 2015 - birthYear;
		System.out.println("Hello, " + name);
		System.out.println("You were " + age + " years old in 2015");
		//Not required to know, but to close the scanner we do this:
		input.close();
		
	}

}
