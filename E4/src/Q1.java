import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		int int3 = input.nextInt();
		
		if(int1 > int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
		
		if(int2 > int3) {
			int temp = int2;
			int2 = int3;
			int3 = temp;
		}
				
			System.out.printf("The sorted integers are: %d %d %d", int1, int2, int3 );
			
			input.close();
		}

	}


