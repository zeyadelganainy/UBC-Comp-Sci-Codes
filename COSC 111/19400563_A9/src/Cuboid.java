
public class Cuboid {

	// Attributes
	double l, w, h;
	String color;

	// Constructors
	public Cuboid(double length, double width, double height, String col) {
		l = length;
		w = width;
		h = height;
		color = col;
	}

	public Cuboid() {
		this(1, 1, 1, "White");
	}

	// Setters & Getters

	public void setLength(double length) {
		l = length;
	}

	public double getLength() {
		return l;
	}

	public void setWidth(double width) {
		w = width;
	}

	public double getWidth() {
		return w;
	}

	public void setHeight(double height) {
		h = height;
	}

	public double getHeight() {
		return h;
	}

	public void setColor(String c) {
		color = c;
	}

	public String getColor() {
		return color;
	}

	// Methods

	public double getSurfaceArea() {
		return 2 * (l * w + l * h + w * h);
	}

	public double getVolume() {
		return l * w * h;
	}

	public void displayInfo() {
		System.out.println("  Color: " + getColor());
		System.out.printf("  Dimensions: %.2f X %.2f X %.2f\n", l, w, h);
		System.out.printf("  Surface Area: %.2f\n", getSurfaceArea());
		System.out.printf("  Volume: %.2f\n", getVolume());
	}
}
