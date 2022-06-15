import java.util.ArrayList;
import java.util.Collections;

public class MSTTest {
	public static void main(String[] args) {
		MSTGraph graph;

		// Test with each of the following individually
//		graph = testGraph1();  	// given 5-vertex graph 
		graph = testGraph2(); // given 6-vertex graph
//		graph = testGraph3(); 	// given 7-vertex graph
//		graph = randomGraph(6);	// random graph with the given number of vertices (see disclaimer in randomGraph())

		System.out.println("Original Graph:");
		graph.printList();

		System.out.println("\nMinimum Spanning Tree:");
		MSTGraph minSpanTree = graph.getMST();
		minSpanTree.printList();
	}

	public static MSTGraph testGraph1() {
		MSTGraph graph = new MSTGraph(5);
		graph.addEdge(0, 1, 5);
		graph.addEdge(0, 2, 3);
		graph.addEdge(0, 3, 9);
		graph.addEdge(0, 4, 4);
		graph.addEdge(1, 2, 8);
		graph.addEdge(1, 3, 3);
		graph.addEdge(1, 4, 5);
		graph.addEdge(2, 3, 6);
		graph.addEdge(2, 4, 1);
		graph.addEdge(3, 4, 7);
		return graph;
	}

	public static MSTGraph testGraph2() {
		MSTGraph graph = new MSTGraph(6);
		graph.addEdge(0, 1, 1);
		graph.addEdge(0, 2, 1);
		graph.addEdge(0, 3, 1);
		graph.addEdge(0, 4, 1);
		graph.addEdge(0, 5, 1);
		graph.addEdge(1, 2, 9);
		graph.addEdge(2, 3, 9);
		graph.addEdge(3, 4, 9);
		graph.addEdge(4, 5, 9);
		return graph;
	}

	public static MSTGraph testGraph3() {
		MSTGraph graph = new MSTGraph(7);
		graph.addEdge(0, 1, 10);
		graph.addEdge(0, 2, 1);
		graph.addEdge(0, 3, 5);
		graph.addEdge(1, 2, 8);
		graph.addEdge(1, 4, 1);
		graph.addEdge(1, 5, 1);
		graph.addEdge(2, 3, 3);
		graph.addEdge(2, 4, 6);
		graph.addEdge(3, 5, 4);
		graph.addEdge(4, 5, 2);
		graph.addEdge(5, 6, 6);
		return graph;
	}

	private static MSTGraph randomGraph(int numVertices) {

		/*
		 * DISCLAIMER: Note that this method may occasionally generate disconnected
		 * graphs. For example, in a 6-node graph, you may have nodes 0, 1, and 2
		 * connected to one another, and nodes 4, 5, and 6 also connected to one
		 * another, but no connection between the two groups of 3 nodes. This will
		 * probably cause an infinite loop, depending on how you write the
		 * MSTGraph.getMST() method. You are not required to account for the chance of
		 * this occurring. If you do get an infinite loop, you should manually stop your
		 * code, then ensure that the graph is actually disconnected by checking the
		 * adjacency list and drawing the generated graph.
		 * 
		 */

		MSTGraph graph = new MSTGraph(numVertices);
		ArrayList<Integer> otherVertices;

		for (int v = 0; v < numVertices; v++) {
			otherVertices = new ArrayList<Integer>();
			for (int x = 0; x < numVertices; x++) {
				if (x == v) {
					continue;
				}
				otherVertices.add(x);
			}
			Collections.shuffle(otherVertices);

			int numEdges = (int) (Math.random() * (numVertices - 2)) + 1;
			// adding the one guarantees every vertex has at least one edge, i.e. no node is
			// disconnected

			for (int e = 0; e < numEdges; e++) {
				int link = otherVertices.remove(0);
				int weight = (int) (Math.random() * 10); // random weight from 0-9
				graph.addEdge(v, link, weight);
			}
		}

		return graph;
	}
}
