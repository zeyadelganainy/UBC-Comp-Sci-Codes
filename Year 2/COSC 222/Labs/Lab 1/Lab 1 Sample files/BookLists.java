package lab1solution;

import java.util.ArrayList;

public class BookLists {
    public static void main(String[] args) {
        /* DO NOT EDIT THE MAIN METHOD */

        //declare and initialize an ArrayList for each book
        ArrayList<Books> aList = new ArrayList<Books>();
        ArrayList<Books> bList = new ArrayList<Books>();
        ArrayList<Books> cList = new ArrayList<Books>();

        //populate all three lists
        addBooks(aList, bList, cList);

        //print the three lists
        System.out.println("Kiana's List:");
        printList(aList);
        System.out.println("Zill's List:");
        printList(bList);
        System.out.println("Bily's List:");
        printList(cList);

        //combine the three lists into one ArrayList (allList)
        System.out.println("Combined List: ");
        ArrayList<Books> allList = combineLists(aList, bList, cList);
        printList(allList);

        //remove the book "Little Women" from allList
        deleteByName(allList, "Little Women");
        System.out.println("No more \"Little Women\" in the list:");
        printList(allList);

        //count the number of unique books in allList
        System.out.println("Number of unique Books in the list: "+countUnique(allList)
                +"\n***");

        //print a temporary book list containing only books by Elizabeth Strout
        System.out.println("Books by Elizabeth Strout:");
        printList(findBookByAuthor(allList,"Elizabeth Strout"));


        //BONUS: combine duplicated books 
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

    private static ArrayList<Books> combineLists(ArrayList<Books> aList, ArrayList<Books> bList, ArrayList<Books> cList) {
        /* YOUR CODE HERE */
        return null; //temporary, change this later
    }

    private static void deleteByName(ArrayList<Books> list, String name) {
        /* YOUR CODE HERE */

    }

    private static void printList(ArrayList<Books> list) {
        /* YOUR CODE HERE */

    }

    private static ArrayList<Books> findBookByAuthor(ArrayList<Books> list, String author) {
        /* YOUR CODE HERE */
        return null; //temporary, change this later

    }

    private static int countUnique(ArrayList<Books> list) {
        /* YOUR CODE HERE */
        
        return 0;  //temporary, change this later
        
    }

    private static void combineDuplicates(ArrayList<Books> list) {
        /* YOUR CODE HERE */


    }
}


