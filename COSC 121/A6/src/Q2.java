import java.io.*;
import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		printShuffled("story.txt");
	}
	
	public static void printShuffled(String filename) {
		/*
		 * Created a new file and figure out its size by using the given equation in the question and then
		 * changing the delimiter in order to take the sentences in the file instead of the full lines
		 * and adding each sentence to its own spot in the array list and then shuffling the list and 
		 * printing it
		 */
		File f = new File(filename);
		int size =(int)( f.length() / 50);
		ArrayList<String> s = new ArrayList<>(size);
		try (Scanner in = new Scanner(f)) {
			in.useDelimiter("[.:!?]");
			while(in.hasNext()) {
				s.add(in.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Collections.shuffle(s);
		System.out.println(s);
	}

}
