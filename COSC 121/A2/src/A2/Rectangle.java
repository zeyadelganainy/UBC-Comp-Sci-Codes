package A2;

public class Rectangle extends Shape {
	//Attributes
	private double width;
	private double height;
	
	//Constructors
	public Rectangle() {
		super();
	}
	
	public Rectangle(String color, boolean filled, double w, double h) { 
		super(color,filled);
		setWidth(w);
		setHeight(h);
	}
	
	public Rectangle(double w, double h) {
		super();
		setWidth(w);
		setHeight(h);
	}
	
	//Setters & Getters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//Methods
	public double getArea() {
		return getWidth() * getHeight();	//Formula of area of rectangle
	}
	
	public double getPerimeter() {
		return 2 * (width + height);		//Formula of permieter of rectangle
	}
	
	public String toString() {
		return super.toString() + "\nWidth: " + getWidth() + ", Height: " + getHeight() +
				".\nArea: " + getArea() + ". Perimeter: " + getPerimeter();
	}
}
