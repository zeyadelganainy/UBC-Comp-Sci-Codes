import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
	/*
	 * For this question, I will use a try-catch within a do-while loop to check for
	 * the validity of the numbers and operator and I will ensure the loop runs
	 * until it's valid by creating a boolean variable that changes from true to
	 * false when it's valid.
	 * 
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a simple mathematical formula: ");
		
		double num1 = 0; double num2 = 0; char operator = 0;		//Initializing the operands and operator
		boolean invalid = true;
		while(invalid) {
			invalid = false;
			try {
				num1 = in.nextDouble();
			} catch (InputMismatchException e) {
				System.out.print("Invalid number format. Try again: ");
				invalid = true;
				in.nextLine();
				continue;
			}
			
				operator = in.next().charAt(0);
				if(operator != '+' && operator != '-' && operator != '/' && operator != '*') {
				System.out.print("Invalid operator. Try again: ");	
				invalid = true;
				in.nextLine();
				continue;
			}
				try{ 
					num2 = in.nextDouble();
					break;
				} catch (InputMismatchException e) {
					System.out.print("Invalid number format. Try again: ");
					invalid = true;
					in.nextLine();
					continue;
				}
				
		} 
		System.out.print("Result: ");
		switch(operator){
			case '+': System.out.println(num1 + num2); break;
			case '-': System.out.println(num1 - num2); break;
			case '/': System.out.println(num1 / num2); break;
			default: System.out.println(num1 * num2);
		}

}

}
