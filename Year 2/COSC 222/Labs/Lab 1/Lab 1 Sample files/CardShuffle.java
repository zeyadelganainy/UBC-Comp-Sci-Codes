package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class CardShuffle{

	public static final String[] SUITS = {"Spades", "Hearts", "Clubs", "Diamonds"};
	public static final String[] RANKS = {"Ace", "2", "3", "4"};

	public static void main(String[] args) {
		/* DO NOT EDIT MAIN METHOD */
		
		//Create a new deck
		ArrayList<String> deck = makeDeck();
		System.out.println("The new deck is "+deck);

		//Shuffle and print it  
		shuffle(deck);
		System.out.println("The shuffled deck is "+deck);

		//Get information about number of hands to deal, and of what size
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many hands should be dealt? ");
		int numHands = keyboard.nextInt();
		System.out.print("How many cards in each hand? ");
		int numCards = keyboard.nextInt();
		keyboard.close();

		if(numHands*numCards > SUITS.length*RANKS.length) {
			System.out.println("ERROR: There are not "+(numHands*numCards)+" cards in the deck.");
			return;
		}
		
		//Deal the hands and print them.
		ArrayList<String>[] theHands = deal(deck,numHands,numCards);
		System.out.println("The hands are:");
		for(int i=0; i<numHands; i++)
			System.out.println("Hand "+(i+1)+": "+theHands[i]);
		System.out.println("The remaining deck: "+deck);

	}

	public static ArrayList<String> makeDeck(){
		/* YOUR CODE HERE */
		return null;
	}

	public static void shuffle(ArrayList<String> deck){
		/* YOUR CODE HERE */
	}

	public static ArrayList<String>[] deal(ArrayList<String> deck, int numHands, int numCards){
		/* YOUR CODE HERE */
		return null;
	}
}