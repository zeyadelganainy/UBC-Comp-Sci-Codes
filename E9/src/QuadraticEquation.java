
public class QuadraticEquation {

	private int a, b, c;

	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public double getRealRoot1() {
		if (getDiscriminant() < 0)
			return 0;
		else
			return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	public double getRealRoot2() {
		if (getDiscriminant() < 0)
			return 0;
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}
}
