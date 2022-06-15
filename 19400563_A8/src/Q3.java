import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		String[][] exam = { {"Alberta", "Edmonton"},
						    {"British Columbia", "Victoria"},
						    {"Manitoba", "Winnipeg"},
						    {"New Brunswick", "Fredericton"},
						    {"Newfoundland and Labrador", "St. John's"},
						    {"Nova Scotia", "Halifax"},
						    {"Ontario", "Toronto"},
						    {"Prince Edward Island", "Charlottetown"},
							{"Quebec", "Quebec City"},
						    {"Saskatchewan", "Regina"} };
		
		System.out.printf("You got %d question(s) right.", getCorrectAnswers(exam));
	}
	
	public static int getCorrectAnswers(String[][] ar) {
		Scanner input = new Scanner(System.in);		//Creates a new scanner
		
		int correct = 0; 
		
		//for loop that goes through each row and asks the user to input the capital of the province in that row
		for(int r = 0; r < ar.length; r++) {
			System.out.printf("What is the capital of %s? " , ar[r][0]);
			String ans = input.nextLine().trim();	//making sure the answer works even if there are extra spaces outside it
			if(ans.equalsIgnoreCase(ar[r][1]))		
				correct++;							//increments the correct number of answers by one if ans is correct
		}
		
		input.close();		//Closes scanner
		
		return correct;	
	}
	
}