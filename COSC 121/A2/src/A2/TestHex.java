package A2;

import java.util.Scanner;
public class TestHex {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner in = new Scanner(System.in);
		System.out.print("Color: ");
		String color = in.nextLine();
		System.out.print("Filled (Yes/No)? ");
		char fill = in.nextLine().toUpperCase().charAt(0);
		System.out.print("Side Length: ");
		double length = in.nextDouble();
		Hexagon hex = new Hexagon(color, fill == 'Y'? true : false, length);
		System.out.println("First Hexagon");
		System.out.println(hex.toString());
		Hexagon hexCopy = (Hexagon) hex.clone();
		System.out.println("Cloned Hexagon");
		System.out.println(hexCopy.toString());
		System.out.println(hex.compareTo(hexCopy) == 0? "Both hexagons are identical" : "Both hexagons are not identical");
		in.close();
	}

}
