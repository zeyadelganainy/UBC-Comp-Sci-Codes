public class Ex4Queue {
    private String[] queue;
    private int rear;

    public Ex4Queue(int maxSize) {
        queue = new String[maxSize];
        rear = 0;
    }

    public void enqueue(String add) {
        /* YOUR CODE HERE */
    }

    private void expandCapacity(){
        /* YOUR CODE HERE */
    }

    public String first() {
        /* YOUR CODE HERE */

        return null; //temporary, change later
    }

    public String dequeue() {

        /* YOUR CODE HERE */

        return null; //temporary, change later
    }

    public boolean isEmpty(){
        return (size() == 0);
    }

    public int size() {
        /* YOUR CODE HERE */

        return 0; //temporary, change later
    }

    public String toString() {
        String s = "[";
        for(int i = 0; i < rear; i++) {
            s += queue[i];
            if(i == (rear-1))
                break;
            s += ", ";
        }
        return s + "]";
    }
}
