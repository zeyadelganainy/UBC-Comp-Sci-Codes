import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	//Main method copied from question
	public static void main(String[] args) {
		String s1 = "Enter number of students: ";
		String s2 = "Enter student grades: ";
		double[] numbers = getNumsFromUser(s1, s2);
		System.out.println(Arrays.toString(numbers));
		} 
	
	public static double[] getNumsFromUser(String msg1, String msg2){
		Scanner input = new Scanner(System.in);		//Create a scanner to take in the following values
		System.out.print(msg1);						//Prints the message that asks for number of students
		double[] arr = new double[input.nextInt()]; //Creates an array of type double that is the length of the value entered by user
		System.out.print(msg2);						//Prints the message that asks for the student grades
		
		//for loop that goes through the whole array and assigns each inputed value to an element in the array
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextDouble();
		input.close();								//Closes the scanner
		return arr;
	}
	
}
