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
		if (graph[node1] == null)
			graph[node1] = new LinkedList<Integer>();
		graph[node1].add(node2);
	}

	// A method which counts the number of starting nodes required to traverse the
	// graph
	// Hint: call DFS from this method
	public void countStartingNodes() {

		LinkedList<Integer> starters = new LinkedList<Integer>();
		boolean visited[] = new boolean[numVertices];
		for (int i = 0; i < numVertices; i++) {
			visited[i] = false;
		}
		for (int i = 0; i < numVertices; i++) {
			if (visited[i] == false) {
				starters.add(i);
				visited = DFS(i, visited);
			}
		}
		System.out.printf("\nYou can traverse the entire graph by selecting %d vertices \n", starters.size());
		System.out.print("Starting vertices are: ");
		for (int i = 0; i < starters.size(); i++) {
			System.out.print(starters.get(i) + " ");
		}
		System.out.println();

	}

	// A method which uses depth-first search (DFS) to traverse the graph
	// Suggestion: use this method recursively
	// You may wish to change what data type is returned
	private boolean[] DFS(int v, boolean[] visited) {
		visited[v] = true;
		if (graph[v] != null) {
			for (int i = 0; i < graph[v].size(); i++) {
				int next = graph[v].get(i);
				if (visited[next] == false) {
					visited = DFS(next, visited);
				}
			}
		}
		return visited;

	}

	// A method to print the graph's adjacency list
	public void printList() {
		for (int i = 0; i < numVertices; i++) {
			System.out.printf("Adjacency list of vertex %d: ", i);
			if (graph[i] == null)
				System.out.println("No vertex found!");
			else {
				for (int j = 0; j < graph[i].size(); j++) {
					if (j != graph[i].size() - 1)
						System.out.print(graph[i].get(j) + ", ");
					else
						System.out.print(graph[i].get(j) + " ");

				}
				System.out.println();
			}

		}

	}

}