import java.io.*;

public class Q2 {

	public static void main(String[] args) {
		viewHex("data.dat");
	}

	private static void viewHex(String filename) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
			int seperator = 0;
			while (dis.available() > 0) {
				seperator++;
				String s = Integer.toHexString(dis.read());
				if (s.length() < 2)
					System.out.printf("0%s ", s.toUpperCase());
				else
					System.out.printf("%s ", s.toUpperCase());
				if (seperator == 8)
					System.out.print("| ");
				if (seperator == 16) {
					seperator = 0;
					System.out.println();
				}

			}
		} catch (IOException e) {
			System.out.println("Encountered an error.");
		}
	}

}
