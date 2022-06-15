public class LinkedListCircularQueue {

    private int count;
    private Node front, rear;

    // Creates an empty queue
    public LinkedListCircularQueue(){

        /* YOUR CODE HERE */
    }

    // Adds the specified element to the rear of the queue
    public void enqueue(String element) {

        /* YOUR CODE HERE */

    }

    // Removes the element at the front of the queue and returns a reference to it
    public String dequeue()  {

        /* YOUR CODE HERE */

        return null; //temporary, change this later
    }

    // Returns the element at the front of the queue without removing it
    public String first() {

        /* YOUR CODE HERE */

        return null; //temporary, change this later
    }

    // Returns true if the queue contains no elements, false otherwise
    public boolean isEmpty() {

        /* YOUR CODE HERE */

        return true; //temporary, change this later
    }

    // Returns the number of elements in the queue
    public int size() {

        /* YOUR CODE HERE */

        return 0; //temporary, change this later

    }

    // Returns a string representation of the queue
    public String toString() {
        String result = "";
        Node current = front;
        if (!isEmpty())
            do {
                result = result + (current.getData()).toString() + "\t";
                current = current.getLink();
            } while (current != front);
        return result;
    }


}
