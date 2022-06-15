import java.util.Scanner;

public class Q3 {
	
	public static double[] getNumsFromUser(String msg1, String msg2){
		Scanner input = new Scanner(System.in);		//Create a scanner to take in the following values
		System.out.print(msg1);						
		double[] arr = new double[input.nextInt()]; //Creates an array of type double that is the length of the value entered by user
		System.out.print(msg2);						
		
		//for loop that goes through the whole array and assigns each inputed value to an element in the array
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextDouble();
		
		input.close();								//Closes the scanner
		
		return arr;									//Returns the reference variable to the main method
	}
	
	public static boolean isSorted(double[] list) {
		
		//For loop that iterates through the array and returns false once it gets to the first pair of unsorted numbers, true otherwise
		for(int i = 0; i < list.length - 1; i++)
			if(list[i] > list[i+1])
				return false;
		
			return true;
		
	}
	
	
	public static void main(String[] args) {
		String s1 = "How many numbers in the list? ";
		String s2 = "Enter the list: ";
		
		double[] numbers = getNumsFromUser(s1,s2);
		
		if(isSorted(numbers))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		}

}
