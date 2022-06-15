public class Ex4Queue {
	private String[] queue;
	private int rear;

	public Ex4Queue(int maxSize) {
		queue = new String[maxSize];
		rear = 0;
	}

	public void enqueue(String add) {
		if (rear == (queue.length - 1))
			expandCapacity();

		queue[rear++] = add;
	}

	private void expandCapacity() {
		String[] expanded = new String[queue.length * 2];
		for (int i = 0; i < queue.length; i++) {
			expanded[i] = queue[i];
		}
		queue = expanded;
	}

	public String first() {
		return queue[0];
	}

	public String dequeue() {
		String temp = queue[0];
		queue[0] = null;
		for (int i = 0; i < queue.length - 1; i++) {
			queue[i] = queue[i + 1];
		}
		rear--;
		return temp;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public int size() {
		return rear;
	}

	public String toString() {
		String s = "[";
		for (int i = 0; i < rear; i++) {
			s += queue[i];
			if (i == (rear - 1))
				break;
			s += ", ";
		}
		return s + "]";
	}
}
