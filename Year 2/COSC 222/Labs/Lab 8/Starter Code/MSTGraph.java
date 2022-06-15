import java.util.ArrayList;
import java.util.LinkedList;

public class MSTGraph {
	private int numVertices;
	private LinkedList<Edge>[] adjListArray;
	
	public MSTGraph(int numVertices) {
		this.numVertices = numVertices;
		adjListArray = new LinkedList[numVertices];
	}
		
	// A method to add a new edge, given the edge's information
	public void addEdge(int node1, int node2, int weight) {
		Edge edge = new Edge(node1, node2, weight);
		addEdge(edge);
	}
	
	// A method to add an edge, given the edge itself
	private void addEdge(Edge edge) {
		int node1 = edge.node1;
		int node2 = edge.node2;
		
		if(adjListArray[node1] == null) {
			adjListArray[node1] = new LinkedList<Edge>();
		}
		if(adjListArray[node2] == null) {
			adjListArray[node2] = new LinkedList<Edge>();
		}
		
		adjListArray[node1].add(edge);
		adjListArray[node2].add(edge);
	}
		
	// A method to create and return the minimum-spanning tree of the graph
	public MSTGraph getMST() {
		
		/* YOUR CODE HERE */
		
		return null; //temporary, change this later		
	}
		
	// A method to print the adjacency list 
	public void printList() {
		
		/* YOUR CODE HERE */
	
	}
	
	// Edge object, representing an undirected, weighted link between two nodes
	class Edge {
		int node1;
		int node2;
		int weight;
		
		Edge(int node1, int node2, int weight){
			this.node1 = node1;
			this.node2 = node2;
			this.weight = weight;
		}
		
		public String toString() {
			return (node1+"-"+node2+"("+weight+")");
		}
	}
}
