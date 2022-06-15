public class DFSTest {
	public static void main(String[] args) {

		int[][] graph0 = { { 0, 1, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 0, 0 }, { 0, 0, 0, 0 } };
		int[][] graph1 = { { 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 1 },
				{ 0, 0, 0, 1, 0 } };
		int[][] graph2 = { { 0, 0, 1, 1 }, { 0, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 0 } };
		int[][] graph3 = { { 0, 1, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 1, 1, 0 } };
		int[][] graph4 = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

		DFSGraph graph = graphFromMatrix(graph1); // change which graph here
		graph.printList();
		graph.countStartingNodes();

	}

	public static DFSGraph graphFromMatrix(int[][] matrix) {
		DFSGraph graph = new DFSGraph(matrix.length);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 1)
					graph.addEdge(row, col);
			}
		}

		return graph;
	}
}
