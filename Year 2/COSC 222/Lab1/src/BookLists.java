import java.util.ArrayList;

public class BookLists {
	public static void main(String[] args) {
		/* DO NOT EDIT THE MAIN METHOD */

		// declare and initialize an ArrayList for each book
		ArrayList<Books> aList = new ArrayList<Books>();
		ArrayList<Books> bList = new ArrayList<Books>();
		ArrayList<Books> cList = new ArrayList<Books>();

		// populate all three lists
		addBooks(aList, bList, cList);

		// print the three lists
		System.out.println("Kiana's List:");
		printList(aList);
		System.out.println("Zill's List:");
		printList(bList);
		System.out.println("Bily's List:");
		printList(cList);

		// combine the three lists into one ArrayList (allList)
		System.out.println("Combined List: ");
		ArrayList<Books> allList = combineLists(aList, bList, cList);
		printList(allList);

		// remove the book "Little Women" from allList
		deleteByName(allList, "Little Women");
		System.out.println("No more \"Little Women\" in the list:");
		printList(allList);

		// count the number of unique books in allList
		System.out.println("Number of unique Books in the list: " + countUnique(allList) + "\n***");

		// print a temporary book list containing only books by Elizabeth Strout
		System.out.println("Books by Elizabeth Strout:");
		printList(findBookByAuthor(allList, "Elizabeth Strout"));

		// BONUS: combine duplicated books
		combineDuplicates(allList);
		System.out.println("BONUS - Combined duplicates:");
		printList(allList);
	}

	private static void addBooks(ArrayList<Books> aList, ArrayList<Books> bList, ArrayList<Books> cList) {
		/* STUDENTS: DO NOT EDIT THIS METHOD */

		aList.add(new Books("Beloved", "Toni Morrison", "Classics", 35.05));
		aList.add(new Books("The Water Dancer", "Ta-Nehisi Coates", "Fantasy", 34.00));
		aList.add(new Books("Ninth House", "Leigh Bardugo", "Fantasy", 27.44));
		aList.add(new Books("Olive Again", "Elizabeth Strout", "Fiction", 31.97));
		aList.add(new Books("Carrie", "Stephen King", "Horror", 50.00));

		bList.add(new Books("Little Women", "Louisa May Alcott", "Classics", 25.16));
		bList.add(new Books("Ninth House", "Leigh Bardugo", "Fantasy", 27.44));
		bList.add(new Books("Carrie", "Stephen King", "Horror", 50.00));
		bList.add(new Books("The Savior", "J.R. Ward", "Romance", 14.89));
		bList.add(new Books("The Help", "Kathryn Stockett", "Fiction", 23.60));

		cList.add(new Books("Olive Again", "Elizabeth Strout", "Fiction", 31.97));
		cList.add(new Books("Carrie", "Stephen King", "Horror", 50.00));
		cList.add(new Books("Circe", "Madeline Miller", "Fantasy", 23.51));
		cList.add(new Books("Amy and Isabelle", "Elizabeth Strout", "Fiction", 21.20));
		cList.add(new Books("Little Women", "Louisa May Alcott", "Classics", 25.16));
	}

	private static ArrayList<Books> combineLists(ArrayList<Books> aList, ArrayList<Books> bList,
			ArrayList<Books> cList) {
		/* YOUR CODE HERE */
		/*
		 * I created a new list that will hold all three lists and used addAll to add
		 * the full collection instead of the individual elements one by one. I did that
		 * for each list.
		 */
		ArrayList<Books> allList = new ArrayList<Books>();
		allList.addAll(aList);
		allList.addAll(bList);
		allList.addAll(cList);

		return allList;
	}

	private static void deleteByName(ArrayList<Books> list, String name) {
		/* YOUR CODE HERE */

		/*
		 * I created a size variable because if I didn't then list.size() would keep
		 * changing every time I take out a book which would not go through the full
		 * array list. Then, I used a for loop to traverse through the whole array list
		 * and check if the book name is equal to that of the parameter "name". If true,
		 * then remove it. I also decrement "size" every time it is true since the list
		 * size would be decremented.
		 */
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (list.get(i).getName().equalsIgnoreCase(name)) {
				list.remove(i);
				size--;
			}
		}

	}

	private static void printList(ArrayList<Books> list) {
		/*
		 * The logic behind this is to traverse through every element of the array list
		 * and print it to the console using a for loop. After doing that, print
		 * asterisks and jump to a new line
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println("- " + list.get(i));
		}
		System.out.println("***\n");
	}

	private static ArrayList<Books> findBookByAuthor(ArrayList<Books> list, String author) {
		/* YOUR CODE HERE */
		
		/*
		 * I created a new array list to hold the elements and then I created a for loop
		 * to traverse through the whole array list and check if the author is the same
		 * as the one specified in the parameter. if that's the case, add that element 
		 * to the new array list then return that.
		 */
		
		ArrayList<Books> authorBooks = new ArrayList<Books>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getAuthor().equalsIgnoreCase(author))
				authorBooks.add(list.get(i));
				
		}
		return authorBooks; 

	}

	private static int countUnique(ArrayList<Books> list) {
		/*
		 * What I did here is initialize an int variable as 0 and then created a nested
		 * loop. The outer loop takes an element and the inner loop compares it with all
		 * the other elements in the array. If i == j that will always result in a
		 * duplicate so we just ignore it. Otherwise, if the book name is the same for
		 * elements i and j then it's a duplicate. If it's not a duplicate (unique) then
		 * increment "unique".
		 */

		int unique = 0;

		for (int i = 0; i < list.size(); i++) {
			boolean duplicate = false;
			for (int j = 0; j < list.size(); j++) {
				if (i == j)
					continue;
				if (list.get(i).getName() == list.get(j).getName())
					duplicate = true;
			}
			if (!duplicate)
				unique++;
		}
		return unique; // temporary, change this later

	}

	private static void combineDuplicates(ArrayList<Books> list) {
		/* YOUR CODE HERE */
		
		/*
		 * I used the same idea as countUnique() but instead of incrementing an integer
		 * we just remove the duplicates if the boolean "duplicate" is true.
		 */
		
		for (int i = 0; i < list.size(); i++) {
			boolean duplicate = false;
			for (int j = 0; j < list.size(); j++) {
				if (i == j)
					continue;
				if (list.get(i).getName() == list.get(j).getName())
					duplicate = true;
			}
			if (duplicate)
				list.remove(i);
		}
	}
}
