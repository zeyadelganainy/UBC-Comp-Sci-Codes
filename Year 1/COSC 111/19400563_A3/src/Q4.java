import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);					//Creates a new object "input" of the Scanner class
		
		System.out.print("Enter a number (All arithmetic operations will be accurate to three decimal places): ");
		
		double num = input.nextDouble();					//Reads the next double value and assigns it to "num"
		
		//Performing the arithmetic operations
		double numSquared = Math.pow(num, 2);			  //Squares "num" and stores it in "numSquared"	
		double numSquareRoot = Math.sqrt(num);		     //Evaluates the square root of "num" and assigns it to "numSquareRoot"
		double numPlus5 = 5;						    //Creates a variable numPlus5 initialized to 5, i did this to keep the original value of num as it is because we need it for other operations
		numPlus5 += num;                               //Adds num to 5 and overwrites numPlus5 to contain that value
		double numTimes5 = 5;						  //Creates a variable numTimes5 initialized to 5 to prevent the original number from being changed as we'll use it in other operations
		numTimes5 *= num;                            //Multiplies num by 5 and overwrites numTimes5 to contain that value
		
		//Printing the values
		System.out.printf("%.3f squared is %.3f \n", num, numSquared );	
		System.out.printf("Square root of %.3f is %.3f \n", num, numSquareRoot );
		System.out.printf("5.000 added to %.3f is %.3f \n", num, numPlus5);
		System.out.printf("5.000 multiplied by %.3f is %.3f \n", num, numTimes5);
		System.out.println((num++) + " incremented then used by Java is " + num);	//The ++num statement uses num first then adds 1 to its value
		--num;                               //Reverts the change done to num so we can use it again to decrement
		System.out.print(num + " decremented then used by Java is " + --num);	    //The num-- statement subtracts 1 from its value first then uses num
		
		input.close(); //Closes the "input" scanner
	}

}
