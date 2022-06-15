import java.util.Scanner;

public class Q2 {
	
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
	
	public static void showLetterGrades(double[] grades) {
		
		//Finding the index of the maximum grade:
		int maxIndex = 0;
		for(int i = 1; i < grades.length; i++) {
			if(grades[i] > grades[maxIndex])
				maxIndex = i;
		}
		
		//Printing the grades:
		for(int i = 0; i < grades.length; i++) {
			System.out.printf("Student %d score is %.1f and grade is ", i+1, grades[i]);
			if(grades[i] >= grades[maxIndex] - 10)
				System.out.println('A');
			else if(grades[i] >= grades[maxIndex] - 20)
				System.out.println('B');
			else if(grades[i] >= grades[maxIndex] - 30)
				System.out.println('C');
			else if(grades[i] >= grades[maxIndex] - 40)
				System.out.println('D');
			else
				System.out.println('F');
		}
	}
	public static void main(String[] args) {
		String s1 = "Enter number of students: ";
		String s2 = "Enter student grades: ";
		double[] numbers = getNumsFromUser(s1,s2);
		showLetterGrades(numbers);
	}

}
