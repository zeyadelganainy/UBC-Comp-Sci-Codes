import java.io.*;
import java.util.*;

public class Q4 {

	public static void main(String[] args) throws Exception {
		String censoredWords[] = { "ABC", "XYZ" };
		try {
			File myFile = new File("source.txt");
			Scanner in = new Scanner(myFile);
			PrintWriter pr = new PrintWriter("destination.txt");
			while (in.hasNextLine()) {
				String s = in.nextLine();
				s = replaceCensoredWords(s.toUpperCase(), censoredWords);
				pr.write(s + "\n");
			}
			in.close();
			pr.close();
		} catch (Exception e) {

		}
	}

	private static String replaceCensoredWords(String line, String[] censoredWords) {
		Scanner input = new Scanner(line);
		String[] splitted = line.split(" ");
		for(int i = 0; i < splitted.length; i++) {
			for(int j = 0; j < censoredWords.length; j++) {
				if(splitted[i].equals(censoredWords[j]))
						splitted[i] = "...";
			}
		}
		line = "";
		for(int i = 0; i < splitted.length; i++) {
			line += splitted[i] + " ";
		}
		return line;
	}

}
