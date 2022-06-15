
public class ArrayStack<T> implements StackADT<T> {

	private T[] stack;
	private int top;

	private final int DEFAULT_CAPACITY = 3;

	// Creates an empty stack using the default capacity
	public ArrayStack() {
		/*
		 * Sets the next open slot to index 0 (first element since it's empty). Then
		 * creates a new stack with default capacity
		 */
		top = 0;
		stack = (T[]) (new Object[DEFAULT_CAPACITY]);

	}

	// Creates an empty stack using the specified capacity
	public ArrayStack(int initialCapacity) {
		/*
		 * Same idea as the constructor above. The only difference is the argument we're
		 * taking for the capacity is now the one passed to the method not the default
		 * capacity.
		 */
		top = 0;
		stack = (T[]) (new Object[initialCapacity]);

	}

	// Adds the given element to the top of the stack (expands capacity if
	// necessary)
	@Override
	public void push(T element) {
		/*
		 * If the stack is full (next available element is out of bounds, then expand
		 * the capacity. Otherwise, set the next available element to "element" and
		 * increment by one to move onto the next space.
		 */
		if (top == stack.length)
			expandCapacity();

		stack[top] = element;
		top++;
	}

	// Removes the top item from the stack and returns it
	@Override
	public T pop() {
		/*
		 * First, check if the list is empty. If that's true then print a message that
		 * says so and do nothing (return null). Otherwise, decrement the top to go back
		 * to the value to be removed and save it in order to return it to the main
		 * method. Then, setting the value of the element at the top to null removes it.
		 * Lastly, return the value of the removed element to the main
		 */
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		top--;
		T result = stack[top];
		stack[top] = null;
		return result;
	}

	// Returns the top item
	@Override
	public T peek() {
		/*
		 * First, check if the list is empty. If that's true then print a message that
		 * says so and do nothing (return null). Otherwise, simply returns the value of
		 * the last occupied index in the stack which is top-1 since top is the value of
		 * the next unoccupied index.
		 */
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		return stack[top - 1];
	}

	// Returns true if the stack is empty and false otherwise
	@Override
	public boolean isEmpty() {
		/*
		 * If the top is 0 then there are no elements in the stack and therefore it's
		 * empty.
		 */
		return (top == 0);
	}

	// Returns the number of elements in the stack
	@Override
	public int size() {

		/*
		 * Since top is the last open slot, that means that this value is the size of
		 * the stack.
		 */
		return top;
	}

	// Returns a string representation of this stack
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < top; i++) {
			str += stack[i].toString() + "\n";
		}
		return str;
	}

	private void expandCapacity() {
		/*
		 * Creates a new stack that is double the capacity of the old one. Then, for
		 * every element in "stack" set the corresponding element in "larger" to the
		 * same value. Then, having "stack" refer to the larger one deletes the old
		 * smaller size one and takes its reference variable to point to the new
		 * "expanded" one. Therefore, on the outside it would look like the one stack
		 * was expanded rather than moved onto a larger one.
		 */
		T[] larger = (T[]) (new Object[stack.length * 2]);
		for (int i = 0; i < stack.length; i++)
			larger[i] = stack[i];
		stack = larger;
	}
}