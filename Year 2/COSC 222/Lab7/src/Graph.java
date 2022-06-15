import java.util.LinkedList;

public class Graph {

	// Represents the number of vertices (nodes) in the graph
	private int numVertices;

	// Stores the adjacency matrix
	private int[][] adjMatrix;

	// Stores the adjacency lists (note it is an array of LinkedLists)
	private LinkedList<Integer>[] adjListArray;

	@SuppressWarnings("unchecked")
	public Graph(int[][] adjMatrix) {

		this.adjMatrix = adjMatrix;
		numVertices = adjMatrix.length;
		adjListArray = new LinkedList[numVertices];
		generateAdjList();

	}

	private void generateAdjList() {

		for (int i = 0; i < numVertices; i++) {
			adjListArray[i] = new LinkedList<Integer>();
			for (int j = 0; j < numVertices; j++) {
				if (adjMatrix[i][j] == 1)
					adjListArray[i].add(j);
			}
		}

	}

	// A method to print the adjacency matrix
	public void printMatrix() {
		System.out.printf("Adjacency matrix (%d nodes):\n", numVertices);
		for (int i = 0; i < numVertices; i++) {
			System.out.print("\t");
			for (int j = 0; j < numVertices; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	// A method to print the adjacency list
	public void printList() {
		for (int i = 0; i < numVertices; i++) {
			System.out.printf("Adjacency list of vertex %d: ", i);
			for (int j = 0; j < adjListArray[i].size(); j++) {
				if (j != adjListArray[i].size() - 1)
					System.out.print(adjListArray[i].get(j) + ", ");
				else
					System.out.print(adjListArray[i].get(j) + " ");

			}
			System.out.println();
		}

	}
}
