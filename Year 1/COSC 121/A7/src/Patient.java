
public class Patient implements Cloneable, Comparable<Patient> {
	// attributes
	private String name;
	private int order; // order of arrival
	private int emergency; // 1 is normal, 5 is life-and-death situation

	// constructor
	public Patient(int order, String name, int priority) {
		this.order = order;
		this.name = name;
		this.emergency = priority;
	}

	// getters and setters
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmergency() {
		return emergency;
	}

	public void setEmergency(int emergency) {
		this.emergency = emergency;
	}

	public String toString() {
		return name;
	}

	/*
	 * This compareTo method will check first who has the higher emergency priority (number) and prioritize them
	 * if they both have the same number, check which one has higher order (less number ) and prioritize it
	 */
	public int compareTo(Patient p) {
		if (this.getEmergency() > p.getEmergency())
			return -1;
		else if (this.getEmergency() < p.getEmergency())
			return 1;
		else
			return this.getOrder() - p.getOrder();

	}
}
