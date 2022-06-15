import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			
			int headsOrTails  = (int)(Math.random() * 2);
			char correctAns = 0 ;
			String otherAns = "";
			if(headsOrTails == 0) {
				correctAns = 'H';
				otherAns = "heads";
			}
			else {
				correctAns = 'T';
				otherAns = "tails";
			}
			
			System.out.print("Guess heads or tails (H or T)? ");
			String input = in.nextLine().toUpperCase();
			char guess = input.charAt(0);
			
			if(guess == correctAns)
				System.out.println("Correct!");
			else
				System.out.println("Sorry, it's " + otherAns);
			
			in.close();
	}

}
