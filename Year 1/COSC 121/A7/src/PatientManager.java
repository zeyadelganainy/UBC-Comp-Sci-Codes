import java.util.*;

public class PatientManager {
	static int order = 0;
	PriorityQueue<Patient> waitingList = new PriorityQueue<Patient>();

	public void start() {
		System.out.println("-----------------");
		System.out.println("(1)  New Patient.");
		System.out.println("(2)  Next Patient.");
		System.out.println("(3)  Waiting List.");
		System.out.println("(4)  Exit.");
		System.out.println("-----------------");
	}

	/*
	 * This method asks for the name and emergency of the patients and checks their validity using exception
	 * handling and then creates a new Patient with the name and emergency number and puts it in queue
	 */
	public void newPatient() {
		Scanner in = new Scanner(System.in);
		System.out.print("\tEnter patient's name: ");
		String name = in.nextLine();

		boolean valid = false;
		int emergency = 0;
		System.out.print("\tEnter emergency [1 (low) to 5 is (life-and-death)]: ");
		while (!valid) {
			try {
				emergency = in.nextInt();
				if (emergency < 1 || emergency > 5)
					throw (new Exception());
				valid = true;
			} catch (Exception e) {
				System.out.print("\t(x) Wrong Value. Try again: ");
				in.nextLine();
			}
		}
		waitingList.offer(new Patient(order++, name, emergency));
		System.out.println("\tPatient added to the waiting list");
	}

	/*
	 * This method first checks if the queue is empty. If yes, display a message. If not, display the name of the
	 * person treated and take them out of the queue
	 */
	public void nextPatient() {
		if (waitingList.peek() == null)
			System.out.println("- No more patients");
		else if (!waitingList.isEmpty())
				System.out.println("\t-" + waitingList.poll().toString() + " is treated.");
	}

	/*
	 * This method will copy the queue into another one and then will print the names of the patients one by
	 * one. If the list is empty to begin with, a message is displayed saying so
	 */
	public void waitingList() {
		PriorityQueue<Patient> clone = new PriorityQueue<Patient>(waitingList);
		if (waitingList.size() == 0)
			System.out.println("- No patients in the list");

		else
			System.out.println("Waiting List includes: ");
		for (int i = 0; i < waitingList.size(); i++) {
			System.out.println("\t- " + clone.poll().toString());
		}
	}
}
