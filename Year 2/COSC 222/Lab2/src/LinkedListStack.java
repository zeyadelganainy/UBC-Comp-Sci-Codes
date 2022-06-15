
public class LinkedListStack<T> implements StackADT<T> {

	private Node<T> top; // Reference to top element of stack
	private Node<T> bottom; // Reference to bottom element of stack
	private int count; // Reference to number of elements in stack

	// Initializes an empty stack
	public LinkedListStack() {

		top = bottom = null;
		count = 0;

	}

	// Adds the given element to the top of the stack (expands capacity if
	// necessary)
	@Override
	public void push(T element) {
		/*
		 * Created a new node and used the constructor from the Node class using element
		 * and top as arguments and then pushed the element into the stack by setting
		 * the link and incremented the count in order to keep track of the size.
		 */
		Node<T> temp = new Node<T>(element, top);
		temp.setLink(top);
		top = temp;
		count++;

	}

	// Removes the top item from the stack and returns it
	@Override
	public T pop() {
		/*
		 * First, check if the stack is empty. If that's the case then print a message
		 * saying so then exit the method by returning null. Otherwise, create a new
		 * variable to store the value of the element we're popping. Then, we unlinked
		 * that element from the top and therefore it has no reference pointing at it
		 * and therefore it doesn't exist anymore.
		 */
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T result = top.getData();
		top = top.getLink();
		count--;
		return result;
	}

	// Returns the top item
	@Override
	public T peek() {
		/*
		 * returns the data in the element at the top of the stack
		 */
		return top.getData();
	}

	// Returns true if the stack is empty and false otherwise
	@Override
	public boolean isEmpty() {
		/*
		 * The stack is empty if both the top and bottom are pointing at null.
		 */
		return (top == null && bottom == null);
	}

	// Returns the number of elements in the stack
	@Override
	public int size() {

		/*
		 * By creating a variable that is updated every time we push and pop we can keep
		 * track of the size of the stack using it and therefore returning it would
		 * return the size of the stack.
		 */

		return count;
	}

	// Returns a string representation of this stack
	@Override
	public String toString() {
		Node<T> temp = top;
		String str = "";
		for (int i = size(); i > 0; i--) {
			str += temp.getData().toString() + "\n";
		}
		return str;

	}
}
