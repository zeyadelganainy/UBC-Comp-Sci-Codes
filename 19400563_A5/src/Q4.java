import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//Creates a scanner called "input"
		
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();		//Reads the next integer in the scanner and stores it in "numOfStudents"
		
		String highestScorerName = "";
		double highestScorerScore = 0;
		String secondHighestName = "";
		double secondHighestScore = 0;
		
		for(int i = 0; i < numOfStudents; i++ ) {
			input.nextLine();		//To avoid "" being taken into the for loop by mistake
			System.out.print("Enter a student name: ");			
			String name = input.nextLine();						//Reads the next string in the scanner and stores it in "name"
			System.out.print("Enter a student score: ");
			double score = input.nextDouble();					//Reads the next double in the scanner and stores it in "score"
			
			/*If statement that stores the information of the current score to highestScore variables if it's larger than the current highest
			If that's the case, the highest gets stored into the 2nd highest*/
			if(score > highestScorerScore ) {
				secondHighestScore = highestScorerScore;
				secondHighestName = highestScorerName;
				highestScorerScore = score;		
				highestScorerName = name;
				}
			//If score is less than highest but more than 2nd highest, we want it to be stored in 2nd highest, so we have this statement:
			else if ( score > secondHighestScore ) {
				secondHighestScore = score;
				secondHighestName = name;
			}
		}
		//Printing the outputs
		System.out.println("Top two student scores:");
		System.out.printf("%s's score is %.1f\n", highestScorerName, highestScorerScore);
		System.out.printf("%s's score is %.1f", secondHighestName, secondHighestScore);
		
		input.close(); 	//Closes the scanner 
	}
}