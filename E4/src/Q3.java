public class Q3 {

	public static void main(String[] args) {	
			
			int rankGenerator = (int) (Math.random() * 52); 
			String rank, suit;
			switch(rankGenerator % 13) {
			case(0): rank = "Ace"; break;
			case(10): rank = "Jack"; break;
			case(11): rank = "Queen"; break;
			case(12): rank = "King"; break;
			default: rank = "" + (rankGenerator % 13);
			}
			
			switch(rankGenerator / 13) {
			case(0): suit = "Clubs"; break;
			case(1): suit = "Diamonds"; break;
			case(2): suit = "Spades"; break;
			default: suit = "Hearts";
			}
			
				System.out.printf("The card you picked was %s of %s", rank, suit);
			
		
			}
			
	}


