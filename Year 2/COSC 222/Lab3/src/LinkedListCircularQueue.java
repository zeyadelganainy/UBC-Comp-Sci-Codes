public class LinkedListCircularQueue {

	private int count;
	private Node front, rear;

	// Creates an empty queue
	public LinkedListCircularQueue() {
		front = rear = null;
		count = 0;

	}

	// Adds the specified element to the rear of the queue
	public void enqueue(String element) {
		Node n = new Node(element, null);
		if (isEmpty())
			front = n;
		else
			rear.setLink(n);
		rear = n;
		rear.setLink(front);
		count++;
	}

	// Removes the element at the front of the queue and returns a reference to it
	public String dequeue() {

		if (isEmpty()) {
			System.out.println("queue is empty, can't remove any items");
			return null;
		}
		String s = front.getData();
		if (front == rear)
			front = rear = null;
		else {
			front = front.getLink();
			rear.setLink(front);
		}
		count--;

		return s;
	}

	// Returns the element at the front of the queue without removing it
	public String first() {

		return front.getData();
	}

	// Returns true if the queue contains no elements, false otherwise
	public boolean isEmpty() {

		return front == null;
	}

	// Returns the number of elements in the queue
	public int size() {

		return count;

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
