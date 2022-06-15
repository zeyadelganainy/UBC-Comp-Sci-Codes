import java.util.LinkedList;
import java.util.Queue;

public class BST {
	private TreeNode root; // The root of the tree.

	// ======================================
	// Creates an empty binary search tree.
	// ======================================
	public BST() {
		root = null;
	}

	// ================================================================
	// Add the specified item to the binary search tree in the
	// appropriate position according to its key value.
	// ================================================================
	public void insert(int newItem) {
		TreeNode start = root;
		TreeNode end = null;

		if (root == null) {
			root = new TreeNode(newItem);
			return;
		}
		while (start != null) {
			end = start;
			if (newItem > start.getData())
				start = start.getRight();
			else
				start = start.getLeft();
		}
		if (newItem > end.getData())
			end.setRight(new TreeNode(newItem));
		else
			end.setLeft(new TreeNode(newItem));

	} // end insert

	// ================================================================
	// Traverse the tree in-order and show value in the binary
	// search tree.
	// ================================================================
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree.");
		else {
			inorderPrint(root);
		}
	}

	// A recursive function to show data in-order
	public void inorderPrint(TreeNode current) {
		if (current != null) {
			inorderPrint(current.left);
			System.out.print(current.data + " ");
			inorderPrint(current.right);
		}
	}

	// ================================================================
	// Traverse the tree and show the data in in in-order and show value
	// in descending order.
	// ================================================================
	public void printTreeDesc() {
		if (root == null)
			System.out.println("Empty tree.");
		else {
			recPrintTreeDesc(root);
		}
	}

	// ============================================
	// A recursive method to to show data in in descending order
	// ============================================
	public void recPrintTreeDesc(TreeNode current) {

		if (current != null) {
			recPrintTreeDesc(current.right);
			System.out.print(current.data + " ");
			recPrintTreeDesc(current.left);
		}

	}

	// ============================================
	// Traverse the tree and print the leaf nodes
	// ============================================
	public void printLeafs() {
		recursivePrintLeafs(root);
	}

	// ============================================
	// A recursive method to print the leaf
	// ============================================
	public void recursivePrintLeafs(TreeNode node) {
		if (node == null)
			return;

		else if (node.left == null && node.right == null)
			System.out.print(node.data + " ");

		if (node.left != null)
			recursivePrintLeafs(node.left);

		if (node.right != null)
			recursivePrintLeafs(node.right);

	}

	// ============================================
	// Traverse the tree and print the internal nodes
	// ============================================
	public void printInternalNodes() {
		recursiveInternalNodes(root);
	}

	// =================================================
	// A recursive method to print the internal nodes
	// =================================================
	public void recursiveInternalNodes(TreeNode node) {

		if (node.left != null || node.right != null)
			System.out.print(node.getData() + " ");
		if (node.left != null)
			recursiveInternalNodes(node.left);
		if (node.right != null)
			recursiveInternalNodes(node.right);

	}

	// ===============================================
	// Count the number of items under a given key
	// ===============================================
	public int countNodes(int key) {
		TreeNode node = search(key);
		if (node == null)
			return -1;
		else
			return recursiveCountNodes(node);
	}

	// =================================================
	// A recursive method to count the number of nodes
	// =================================================
	public int recursiveCountNodes(TreeNode node) {
		if (null == node)
			return 0;
		return 1 + recursiveCountNodes(node.left) + recursiveCountNodes(node.right);
	}

	// =================================================
	// Find the minimum value stored in the subtree
	// rooted at a given key value
	// =================================================
	public TreeNode findSmallest(int item) {

		/* YOUR CODE HERE */

		return null; // temporary, change this later
	}

	// =================================================
	// This function returns if the binary tree
	// is perfect or not
	// =================================================
	public boolean isPerfectTree() {
		// An empty tree is perfect
		if (root == null) {
			return true;
		}
		int x = (int) (Math.pow(2, getHeight() - 1)); // inClassActivityFour last question hint
		return (countNodes(root.getData()) == x);
	}

	public void printIsPerfectTree() {
		if (this.isPerfectTree()) {
			System.out.println("Tree is Pefect");
		} else {
			System.out.println("Tree is NOT Pefect");
		}
	}

	// =================================================
	// This function returns if the binary tree
	// is complete or not
	// =================================================

	public boolean isCompleteTree() {
		if (root == null)
			return true;

		Queue<TreeNode> queue = new LinkedList<>();
		boolean isComplete = false;
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			if (temp.left != null) {
				if (isComplete == true)
					return false;
				queue.add(temp.left);
			} else
				isComplete = true;

			if (temp.right != null) {

				if (isComplete == true)
					return false;
				queue.add(temp.right);

			} else
				isComplete = true;
		}
		return true;
	}

	public void printIsComplete() {
		if (this.isCompleteTree()) {
			System.out.println("Tree is Complete");
		} else {
			System.out.println("Tree is NOT Complete");
		}
	}

	// =================================================
	// This function returns if the binary tree
	// is full or not
	// =================================================
	public boolean isFullTree() {
		// An empty tree is perfect
		if (root == null)
			return true;
		else
			return recursiveIsFullTree(root);
	}

	public boolean recursiveIsFullTree(TreeNode node) {
		if (node == null)
			return true;
		if ((node.getLeft() != null && node.getRight() != null) || (node.getLeft() == null && node.getRight() == null))
			return (recursiveIsFullTree(node.getLeft()) && recursiveIsFullTree(node.getRight()));
		else
			return false;
	}

	public void printIsFullTree() {
		if (this.isFullTree()) {
			System.out.println("Tree is Full");
		} else {
			System.out.println("Tree is NOT Full");
		}
	}

	// =================================================
	// This function returns the height of the tree
	// =================================================
	public int getHeight() {
		return getHeightRecursive(root);
	}

	public int getHeightRecursive(TreeNode node) {
		int height = -1;
		if (root == null)
			return height;
		else if (node != null) {
			int leftHeight = getHeightRecursive(node.left);
			int rightHeight = getHeightRecursive(node.right);
			height = 1 + Math.max(leftHeight, rightHeight);
		}
		return height;
	}

	// =================================================
	// This function returns if the binary tree
	// is Degenerate or not
	// =================================================
	public boolean isDegenerateBinaryTree() {

		return (countNodes(root.getData()) - 1 == getHeight());
	}

	public void printIsDegenerateTree() {
		if (this.isDegenerateBinaryTree()) {
			System.out.println("Tree is Degenerate");
		} else {
			System.out.println("Tree is NOT Degenerate");
		}
	}

	// =================================================
	// An iterative code to search an item in a tree
	// =================================================
	public TreeNode search(int key) {

		TreeNode current = root;
		boolean found = false;
		while ((current != null) && (!found)) {
			if (key == current.data)
				found = true;
			else if (key < current.data)
				current = current.left;
			else
				current = current.right;
		}

		if (found)
			return current;
		else
			return null;
	}
}