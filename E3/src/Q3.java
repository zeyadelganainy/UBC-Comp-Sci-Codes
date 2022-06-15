
public class Q3 {

	public static void main(String[] args) {
		
		int letterNum = ( 65 + (int)( Math.random() * 26) );
		char letter = (char) letterNum; 
		System.out.println("A random uppercase letter is " + letter);
		
		/*
		 * int random = 'A' + ((int) (Math.random() * 26));
		char randomChar = (char) random;
		System.out.println("A random uppercase letter is " + randomChar);
		*/
	}

}
