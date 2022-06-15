
public class Lake {

	// Attributes
	private String name, province;
	private double area, altitude;

	// Constructor
	public Lake(String name, String province, double area, double altitude) {
		this.name = name;
		this.province = province;
		this.area = area;
		this.altitude = altitude;
	}

	// Setters & Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String toString() {
		return name + ", " + province + ", " + area + " sq km, " + altitude + " meters";
	}

}
