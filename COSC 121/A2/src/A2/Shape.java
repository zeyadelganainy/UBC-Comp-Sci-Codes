package A2;

public abstract class Shape implements Cloneable, Comparable<Shape> {
	//attributes
	private String color;
	private boolean filled;
	//constructors
	protected Shape(){this("White", true);}
	protected Shape(String color, boolean filled){
		setColor(color);
		setFilled(filled);
	}
	//methods
	public String getColor(){return color;}
	public void setColor(String color){this.color = color;}
	public boolean isFilled(){return filled;}
	public void setFilled(boolean f){filled = f;}
	public String toString(){
		return "Color: " + color + ". " + (filled? "Filled. ":"Not filled. ");
	}
	
	/* The compareTo method should return 1 if the current object has a bigger area than the object we're 
	 * comparing it to. Should return 0 if they have the same area value, and -1 if the object we're comparing
	 * with has a bigger area value
	 */
	public int compareTo(Shape shp) {
		if(this.getArea() > shp.getArea())
			return 1;
		else if(this.getArea() == shp.getArea())
			return 0;
		else
			return -1;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


