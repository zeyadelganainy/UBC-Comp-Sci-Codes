import java.util.ArrayList;
import java.util.Scanner;

public class CardShuffle {

	public static final String[] SUITS = { "Spades", "Hearts", "Clubs", "Diamonds" };
	public static final String[] RANKS = { "Ace", "2", "3", "4" };

	public static void main(String[] args) {
		/* DO NOT EDIT MAIN METHOD */

		// Create a new deck
		ArrayList<String> deck = makeDeck();
		System.out.println("The new deck is " + deck);

		// Shuffle and print it
		shuffle(deck);
		System.out.println("The shuffled deck is " + deck);

		// Get information about number of hands to deal, and of what size
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many hands should be dealt? ");
		int numHands = keyboard.nextInt();
		System.out.print("How many cards in each hand? ");
		int numCards = keyboard.nextInt();
		keyboard.close();

		if (numHands * numCards > SUITS.length * RANKS.length) {
			System.out.println("ERROR: There are not " + (numHands * numCards) + " cards in the deck.");
			return;
		}

		// Deal the hands and print them.
		ArrayList<String>[] theHands = deal(deck, numHands, numCards);
		System.out.println("The hands are:");
		for (int i = 0; i < numHands; i++)
			System.out.println("Hand " + (i + 1) + ": " + theHands[i]);
		System.out.println("The remaining deck: " + deck);

	}

	public static ArrayList<String> makeDeck() {
		/* YOUR CODE HERE */
		
		/*
		 * Created a new String array list and created nested loops. The outer loop
		 * is in charge of assigning the suits and the inner loops is in charge of 
		 * assigning ranks. Then for every rank and every suit, add it to the new
		 * array list "deck" 
		 */
		ArrayList<String> deck = new ArrayList<String>();
		for (int i = 0; i < SUITS.length; i++) {
			for (int j = 0; j < RANKS.length; j++) {
				deck.add(RANKS[i] + " of " + SUITS[j]); 
			}
		}
		return deck;
	}

	public static void shuffle(ArrayList<String> deck) {
		/* YOUR CODE HERE */
		
		/*
		 * For every element in that array list, create a random number between i and
		 * (size - i) and then I simultaneously removed that card from that position and
		 * added it at position i. Except for when it's 0. The only difference is that
		 * we create a random number from i and (size - 1)
		 */
		
		for(int i = 0; i < deck.size(); i++) {
			if(i == 0) {
				int random = (int)(Math.random() * (deck.size() - 1));
				deck.add(i, deck.remove(random));
			}
			else {
				int random = (int)(Math.random() * (deck.size() - i) + i);
				deck.add(i, deck.remove(random));
			}
				
		}
	}

	public static ArrayList<String>[] deal(ArrayList<String> deck, int numHands, int numCards) {
		/* YOUR CODE HERE */
		
		/*
		 * Create a new ARRAY of ArrayLists that has a size of numHands. Then, initialize each
		 * hand to a size of numCards. Then, for every card in the deck, remove it and then add
		 * it to a hand one by one.
		 */
		ArrayList<String>[] hand = (ArrayList<String>[]) new ArrayList[numHands];
		for(int i = 0; i < numHands; i++) {
			hand[i] = new ArrayList<String>(numCards);
			for(int j = 0; j < numCards; j++) {
				hand[i].add(deck.remove(0));
			}
		}
		
		return hand;
	}
}