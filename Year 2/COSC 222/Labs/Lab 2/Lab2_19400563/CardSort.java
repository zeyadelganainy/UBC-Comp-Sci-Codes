
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CardSort {

	public static final String[] RANKS = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };
	public static final String[] SUITS = { "Spades", "Hearts", "Clubs", "Diamonds" };

	public static void main(String[] args) {

		/* DO NOT EDIT THE MAIN METHOD */

		// make a deck of cards, should have 52 cards
		Stack<String> deck = makeDeck();
		System.out.println("New deck: " + deck.size() + " cards");
		System.out.println(deck);
		System.out.println();

		// automatically shuffles the deck, don't need to code this
		Collections.shuffle(deck);
		System.out.println("Shuffled deck: " + deck.size() + " cards");
		System.out.println(deck);
		System.out.println();

		// create an ArrayList of Stacks, each representing all the cards of one suit
		ArrayList<Stack<String>> bySuit = sortSuits(deck);
		for (int i = 0; i < bySuit.size(); i++) {
			// each new stack should have 13 cards, all the same suit
			System.out.println(SUITS[i] + ": " + bySuit.get(i).size() + " cards");
			System.out.println(bySuit.get(i));
			System.out.println();
		}

		// the deck should now be empty
		System.out.println("Deck is empty? " + deck.isEmpty() + " (" + deck.size() + " cards)");
	}

	public static Stack<String> makeDeck() {
		/*
		 * Created a new strings stack. Then, for every rank and every suit, push the
		 * rank and the suit into the stack.
		 */
		Stack<String> deck = new Stack<String>();
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck.push(RANKS[i] + " of " + SUITS[j]);
			}
		}
		return deck;
	}

	public static ArrayList<Stack<String>> sortSuits(Stack<String> deck) {
		/* 
		 * Create a new array list of string stacks and then initialize them all.
		 * Then, while the deck is not empty,take a card off the deck and compare it with all
		 * 4 suits to see if it matches. Once it does, place it in that corresponding suit
		 */
		ArrayList<Stack<String>> sorted = new ArrayList<Stack<String>>(4);
		for (int i = 0; i < 4; i++) {
			sorted.add(new Stack<String>());
		}

		while (!deck.isEmpty()) {
			String s = deck.pop();
			for (int i = 0; i < SUITS.length; i++) {
				for (int j = 0; j < RANKS.length; j++) {
					if (s.contains(SUITS[0])) {
						sorted.get(0).push(s);
						s = "";
					} else if (s.contains(SUITS[1])) {
						sorted.get(1).push(s);
						s = "";
					} else if (s.contains(SUITS[2])) {
						sorted.get(2).push(s);
						s = "";
					} else if(s.contains(SUITS[3])) {
						sorted.get(3).push(s);
						s = "";
					}
				}
			}
		}

		return sorted;
	}
}
