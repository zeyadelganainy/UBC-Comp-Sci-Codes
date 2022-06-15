import java.util.LinkedList;

public class DFSGraph {
	private int numVertices;
	private LinkedList<Integer>[] graph;

	public DFSGraph(int numVertices) {
		this.numVertices = numVertices;
		graph = new LinkedList[numVertices];
	}

	// A method to add an undirected edge to the graph between two nodes
	public void addEdge(int node1, int node2) {
		if(graph[node1] == null)
			graph[node1] = new LinkedList<Integer>();
		graph[node1].add(node2);
	}

	// A method which counts the number of starting nodes required to traverse the graph
	// Hint: call DFS from this method
	public void countStartingNodes() {
		
		/* YOUR CODE HERE */
		
	}

	// A method which uses depth-first search (DFS) to traverse the graph
	// Suggestion: use this method recursively
	// You may wish to change what data type is returned
	private void DFS(int v, boolean[] visited) {

		/* YOUR CODE HERE */
		
	}

	// A method to print the graph's adjacency list 
	public void printList() {

		/* YOUR CODE HERE */
		
	}

}