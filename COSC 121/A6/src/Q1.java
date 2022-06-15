import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter five integers: ");
		ArrayList<Integer> list = new ArrayList<>(5);
		for (int i = 0; i < 5; i++) {
			list.add(in.nextInt());
		}
		System.out.println("Your list without duplicates: " + noDuplicates(list));
		in.close();
	}

	public static ArrayList<Integer> noDuplicates(ArrayList<Integer> list) {
		/*
		 * The idea behind is method is to create a new one of the same size and check every element in the 
		 * original, if it does not exist in the new list the add it but if it exists that means that it's
		 * a duplicate and that it shouldn't be added therefore we get a new list of only the unique values
		 */
		ArrayList<Integer> unique = new ArrayList<>(list.size());
		for(Integer i: list)
			if(!unique.contains(i))
				unique.add(i);
		return unique;
	}
}
