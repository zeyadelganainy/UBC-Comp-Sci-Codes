
public class Q2 {

	public static void main(String[] args) {
		
		System.out.println("Celsius  Fahrenheit   | Fahrenheit  Celsius");
		System.out.println("-------------------------------------------");
		double fahrenheit = 50;
		double celsius = 20;
		for(int i = 0; i < 10; i++) {
			System.out.printf("%-10.0f %-2.2f      | %-10.0f %-2.2f\n", celsius, toFahrenheit(celsius), fahrenheit, toCelsius(fahrenheit));
			fahrenheit += 5;
			celsius++;
		}
		}

	public static double toFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	public static double toCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
