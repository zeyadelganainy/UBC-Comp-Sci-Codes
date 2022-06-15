/*
 * Notice that System.out.println() has been called in most methods 
 * We recommend that you keep these lines of code where they are, 
 * to help you follow the process of your code.
 */

public class PriorityQueue {
	
	//Reference to the first node in the queue
	private PQNode first;
	
	// Default constructor, initializes empty list
	public PriorityQueue(){
		
		/* YOUR CODE HERE */
		
	}
	
	// First add method
	public void add(String name, String problem, int priority) {
		/* DO NOT EDIT THIS METHOD */
		add(new PQNode(name, problem, priority));
	}
	
	// Second add method
	private void add(PQNode node) {
		System.out.println("add "+node.getName());
		
		/* YOUR CODE HERE */
		
	}
	
	public PQNode remove() {
		System.out.println("remove");
		
		/* YOUR CODE HERE */
		
		return null; //temporary, change this later
		
	}
	
	private PQNode remove(PQNode node) {
		System.out.println("remove "+node.getName());
		
		/* YOUR CODE HERE */

		return null; //temporary, change this later
	}
	
	public PQNode peek() {
		return first;
	}
	
	public boolean isEmpty() {

		/* YOUR CODE HERE */
		
		return false; //temporary, change this later
	}
	
	public int size() {
		
		/* YOUR CODE HERE */

		return 0; //temporary, change this later
	}
	
	public void changePriority(String name, int newPriority) {
		System.out.println("change priority of "+name+" to "+newPriority);

		/* YOUR CODE HERE */
		
	}
	
	public String toString() {
		/* DO NOT EDIT THIS METHOD */
		if(isEmpty()){
			return "Empty queue";
		}
		int index = 1;
		PQNode current = first;
		String s = "----------\n";
		while(current != null) {
			s += "-  #"+index+": "+current.toString()+"\n";
			current = current.getNext();
			index++;
		}
		s += "----------";
		return s;
	}
}
