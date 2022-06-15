import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a,b,c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		QuadraticEquation eq = new QuadraticEquation(a,b,c);
		
		if(eq.getDiscriminant() > 0)
			System.out.printf("The roots are %.1f and %.1f", eq.getRealRoot1(), eq.getRealRoot2());
		else if ( eq.getDiscriminant() == 0)
			System.out.printf("The root is %.1f", eq.getRealRoot1());
		else
			System.out.println("The equation has no real roots");
	}

}
