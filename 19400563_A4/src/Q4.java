import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
	
		int computerGuessInt = (int) ( Math.random() * 3 );	//Generates a random guess between 0 and 2 (inclusive)
		
		Scanner input = new Scanner(System.in);		//Creates a new scanner called "input"
		
		System.out.print("Scissors (0), Rock(1), Paper(2): ");
		int userGuessInt = input.nextInt();		//Reads the next integers and stores it in an int variable named "userGuess"
		
		//Creating winning and tie condition
		boolean rockWin = ( computerGuessInt == 0 && userGuessInt == 1);
		boolean paperWin = ( computerGuessInt == 1 && userGuessInt == 2 );
		boolean scissorsWin = ( computerGuessInt == 2 && userGuessInt == 0 );
		boolean tie = computerGuessInt == userGuessInt ;
		
		//Assigning string values to the COMPUTER guess so it can be printed in a better way
		String computerGuess = "";
		switch(computerGuessInt) {
		case 0 : computerGuess = "scissors" ; break;
		case 1 : computerGuess = "rock"; break;
		default : computerGuess = "paper";
		}
		
		//Assigning string values to the USER guess so it can be printed in a better way
		String userGuess = "";
		switch(userGuessInt) {
		case 0 : userGuess = "scissors" ; break;
		case 1 : userGuess = "rock"; break;
		case 2 : userGuess = "paper"; break;
		default : userGuess = "INVALID";
		}
		
		//To guarantee that only 0,1,2 will give an answer, if the guess is invalid, the game will not work and the user will be given an error message
		if( !(userGuess == "INVALID") ) {
			
			System.out.print("The computer is " + computerGuess + ". ");
			System.out.print("You are " + userGuess + ". ");
			
			if( rockWin || paperWin || scissorsWin ) //Checking if the user one in any of the three scenarios
				System.out.println("You Won!");
		
			else if ( tie )							//If they didn't win, but it's a tie
				System.out.println("It's a tie!");
		
			else									//If they didn't win or tie (they lost)
				System.out.println("You lost, better luck next time!");
		}
		else 
			System.out.println("You have entered an invalid number.");
		
		input.close();		//Closes the scanner named "input"
	}

}
