import java.util.Scanner;
public class Q2 {

	public static int indexOfMin(double[] array) {
			int indexMin = 0;
			double min = array[indexMin];
			for( int i = 1; i < array.length; i++ ) {
				if (array[i] < min) {
		               min = array[i];
		               indexMin = i;
		}
			}
			return indexMin;
	}
	public static void main(String[] args) {
		
		double[] arr = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		for( int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("The index of the min is "+ indexOfMin(arr));
	}

}
