
public class Q1 {

	public static void main(String[] args) {
		
		//Creating the cuboid objects
		Cuboid c1 = new Cuboid();
		Cuboid c2 = new Cuboid(8, 3.5, 5.9, "Green");
		
		//Testing the program
		System.out.println("Cuboid 1");
		c1.displayInfo();
		
		System.out.println("Cuboid 2");
		c2.displayInfo();
	}

}
