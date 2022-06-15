package A2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Shape[] shapes1 = new Shape[5];
		Shape[] shapes2 = new Shape[5];
		
		shapes1[0] = new Rectangle("blue",true,20,40);
		shapes1[1] = new Rectangle("red",false,10,30);
		shapes1[2] = new Rectangle("green",true,37,41);
		shapes1[3] = new Hexagon("Purple", true, 6);
		shapes1[4] = new Hexagon("Orange", false, 9);
		
		double sum = 0;
		for(int i = 0; i < shapes1.length; i++) {
			sum += shapes1[i].getArea();
		}
		System.out.println("The sum of all shapes in 'shapes1' is " + sum);
		
		for(int i = 0; i < shapes1.length; i++) {
			shapes2[i] = (Shape) shapes1[i].clone();
		}
		System.out.println("Shapes1 has been cloned to Shapes2.");
		Arrays.sort(shapes2);
		System.out.println("Shapes2 has been reordered!");
		
		System.out.printf("%-25s%-25s\n","Area in shapes1", "Areas in shapes2");
		for(int i = 0; i < shapes1.length; i++) {
			System.out.printf("%-25.2f%-25.2f\n",shapes1[i].getArea(), shapes2[i].getArea());
		}
	}

}
