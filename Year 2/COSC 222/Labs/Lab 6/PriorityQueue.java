/*
 * Notice that System.out.println() has been called in most methods 
 * We recommend that you keep these lines of code where they are, 
 * to help you follow the process of your code.
 */

public class PriorityQueue {

	// Reference to the first node in the queue
	private PQNode first;

	// Default constructor, initializes empty list
	public PriorityQueue() {

		first = null;

	}

	// First add method
	public void add(String name, String problem, int priority) {
		/* DO NOT EDIT THIS METHOD */
		add(new PQNode(name, problem, priority));
	}

	// Second add method
	private void add(PQNode node) {
		System.out.println("add " + node.getName());

		if (isEmpty()) {
			first = node;
			first.setPrevious(null);
			first.setNext(null);
			return;
		}
		PQNode next = first;
		while (next.getPriority() <= (node.getPriority())) {
			next = next.getNext();
			if(next == null) {
				next = first;
				while(next.getNext() != null) {
					next = next.getNext();
				}
				next.setNext(node);
				node.setPrevious(next);
				return;
			}
		}
		if(next == first) {
			node.setNext(first);
			first.setPrevious(node);
			first = node;
		}else {
			node.setNext(next);
			next.getPrevious().setNext(node);
			node.setPrevious(next.getPrevious());
			next.setPrevious(node);
		}
	}

	public PQNode remove() {
		System.out.println("remove");
		return remove(first);
	}

	private PQNode remove(PQNode node) {
		System.out.println("remove " + node.getName());

		PQNode temp = first;
		
		if (first.getNext() == null)
			first.setPrevious(null);
		else
			first.getNext().setPrevious(null);
		first = first.getNext();

		return temp;
	}

	public PQNode peek() {
		return first;
	}

	public boolean isEmpty() {

		return size() == 0;
	}

	public int size() {

		int s = 0;
		if (first == null)
			return s;
		PQNode sizeTraversal = first;
		while (sizeTraversal != null) {
			sizeTraversal = sizeTraversal.getNext();
			s++;
		}
		return s;
	}

	public void changePriority(String name, int newPriority) {
		System.out.println("change priority of " + name + " to " + newPriority);
		
		PQNode current = first;
		String tempProb = null;
		
		while(current != null && current.getName().compareToIgnoreCase(name) > 0) {
			current = current.getNext();
			tempProb = current.getProblem();
		}
		remove(current.getNext());
		add(name,tempProb, newPriority);

	}

	public String toString() {
		/* DO NOT EDIT THIS METHOD */
		if (isEmpty()) {
			return "Empty queue";
		}
		int index = 1;
		PQNode current = first;
		String s = "----------\n";
		while (current != null) {
			s += "-  #" + index + ": " + current.toString() + "\n";
			current = current.getNext();
			index++;
		}
		s += "----------";
		return s;
	}
}
