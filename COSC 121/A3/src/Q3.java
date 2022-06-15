import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a simple mathemical formula: ");
		double num1 = 0; double num2 = 0; char operator = 0;		//Initializing the operands and operator
		boolean invalid = true;
		while(invalid) {
			invalid = false;
			try {
				num1 = Double.parseDouble(input.next());
			} catch (NumberFormatException e) {
				System.out.print("Invalid number format. Try again: ");
				invalid = true;
				input.nextLine();
				continue;
			}
			
				operator = input.next().charAt(0);
				if(operator != '+' && operator != '-' && operator != '/' && operator != '*') {
				System.out.print("Invalid operator. Try again: ");	
				invalid = true;
				input.nextLine();
				continue;
			}
				try{ 
					num2 = Double.parseDouble(input.next());
					break;
				} catch (NumberFormatException e) {
					System.out.print("Invalid number format. Try again: ");
					invalid = true;
					input.nextLine();
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
