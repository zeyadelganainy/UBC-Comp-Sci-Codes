
public class Q3 {

	public static void main(String[] args) {
		int count = 0;
		//For loop to iterate through all numbers through 100 and 200 inclusive
		for( int x = 100; x <= 200; x++) {
			//The ^ (XOR) operator returns true if only one of the two sides is true, but not both 
			if( x % 5 == 0 ^ x % 6 == 0) {
				System.out.print(x + " ");
				count++;
				if( count == 10) {
					System.out.println();
					count = 0;		//Resetting the counter so that it skips a line automatically every 10 instead of at 10,20,30,etc
				}
			}
		}
	}

}
