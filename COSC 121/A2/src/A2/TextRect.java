package A2;

import java.util.Scanner;

public class TextRect {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner in = new Scanner(System.in);
		System.out.print("Color: ");
		String color = in.nextLine();
		System.out.print("Filled (Yes/No)? ");
		char fill = in.nextLine().toUpperCase().charAt(0);
		System.out.print("Width and Height: ");
		double width = in.nextDouble();
		double height = in.nextDouble();
		Rectangle rect = new Rectangle(color, fill == 'Y'? true : false, width, height);
		System.out.println("First Rectangle");
		System.out.println(rect.toString());
		Rectangle rectCopy = (Rectangle) rect.clone();
		System.out.println("Cloned Rectangle");
		System.out.println(rectCopy.toString());
		System.out.println(rect.compareTo(rectCopy) == 0? "Both rectangles are identical" : "Both rectangles are not identical");
		in.close();

	}

}
