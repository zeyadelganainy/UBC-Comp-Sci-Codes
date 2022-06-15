
public class Q1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("i = %d  f(i) = %.2f\n", i, q1(i));
		}
	}

	public static double q1(double n) {
		/*
		 * Base case: when i = 1 it will be 1/2 
		 * Recursive call: adding 1/(2*n) to the q1 of the previous n
		 */
		if (n == 1)
			return 0.5;
		else
			return q1(n - 1) + (1 / (2 * n));
	}

}
