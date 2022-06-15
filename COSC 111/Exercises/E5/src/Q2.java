import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students (1 to 30): ");
		int students = input.nextInt();
		
		while(students < 1 || students > 30 ) {
			System.out.print("Invalid number. Try again: ");
			students = input.nextInt();
		}
		double maxGPA = 0;
		double gpa = 0;
		for ( int count = 1; count <= students; count++ ) {
			System.out.print("Enter GPA of Student " + count + ": ");
			gpa = input.nextDouble();
			while ( gpa < 0  || gpa > 4 ) {
				System.out.print("Invalid GPA value. Try again: ");
				gpa = input.nextDouble();
			}
			if ( gpa > maxGPA)
				maxGPA = gpa;
				
		}
		System.out.println("Top GPA is " + maxGPA);
		input.close();
	}
}
