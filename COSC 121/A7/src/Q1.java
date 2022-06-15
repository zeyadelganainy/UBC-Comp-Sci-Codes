import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		PatientManager pManager = new PatientManager();
		pManager.start();
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		boolean exit = false;
		int item = 0;
		System.out.print("* Choose an item from the menu: ");
		while (!exit) {

			if (!valid) {
				try {
					item = in.nextInt();
					if (item < 1 || item > 4) {
						throw (new Exception());
					}
					switch (item) {
					case 1:
						pManager.newPatient();
						break;
					case 2:
						pManager.nextPatient();
						break;
					case 3:
						pManager.waitingList();
						break;

					default:
						System.out.println("Program terminated. Goodbye!");
						exit = true;
						System.exit(0);
					}
					valid = true;
				} catch (Exception e) {
					System.out.println("(x) Wrong Choice.");
					System.out.print("* Choose an item from the menu: ");
					in.nextLine();
				}
			} else {
				System.out.print("* Choose an item from the menu: ");
				try {
					item = in.nextInt();
					if (item < 1 || item > 4) {
						throw (new Exception());
					}
					switch (item) {
					case 1:
						pManager.newPatient();
						break;
					case 2:
						pManager.nextPatient();
						break;
					case 3:
						pManager.waitingList();
						break;

					default:
						System.out.println("Program terminated. Goodbye!");
						exit = true;
						System.exit(0);
					}
				} catch (Exception e) {
					System.out.println("(x) Wrong Choice.");
					in.nextLine();
				}
			}
		}

	}
}
