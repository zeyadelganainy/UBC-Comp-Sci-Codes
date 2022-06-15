package A2;

public class Hexagon extends Shape {
	//Attributes
	private double side;
	
	//Constructors
	public Hexagon() {
		super();
	}
	
	public Hexagon(String color, boolean filled, double side) { 
		super(color,filled);
		setSide(side);
	}
	
	public Hexagon(double side) {
		super();
		setSide(side);
	}
	
	
	//Setters & Getters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	
	//Methods
	public double getArea() {
		return (3.0/2) * Math.sqrt(3) * Math.pow(side,2); //Formula of area of hexagon
	}
	
	public double getPerimeter() {
		return side * 6;	//Formula of perimeter of regular hexagon
	}
	
	public String toString() {
		return super.toString() + "\nSide: " + getSide() + ". Area: " + getArea() + ". Perimeter: " + getPerimeter();
	}
}
