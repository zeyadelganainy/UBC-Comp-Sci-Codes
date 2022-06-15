public class BinaryTreeTest {
	public static void main(String[] args) {

		System.out.println("-----Test Tree 1-----");
		printOutput(testTree1());
		System.out.println("-----Test Tree 2-----");
		printOutput(testTree2());
		System.out.println("-----Test Tree 3-----");
		printOutput(testTree3());
	}

	public static void printOutput(BinaryTree root) {
		System.out.println("Inorder traversal: ");
		root.inorderTraversal();
		System.out.println();
		System.out.println("Size of the tree: " + root.size());
		System.out.println("Height of the tree: " + root.height());
		System.out.println();
	}

	public static BinaryTree testTree1() {
		// First, sub-trees ll and lr are created
		BinaryTree ll = new BinaryTree("Dagger and the Coin");
		ll.attachToLeft("A Dance With Dragons");
		ll.attachToRight("Fantastic Beasts and Where to Find Them");

		BinaryTree lr = new BinaryTree("Keys to the Kingdom");
		lr.attachToLeft("Haroun and the Sea of Stories");
		lr.attachToRight("Mistborn");

		// Now sub-trees are attached to a tree l
		BinaryTree l = new BinaryTree("Golem and the Jinni", ll, lr);

		// A new subtree, r, is created
		BinaryTree r = new BinaryTree("Rage of Dragons");
		r.attachToLeft("On Stranger Tides");
		r.attachToRight("Wheel of Time");

		// A new subtree, t, is created, Also l and r are added to the tree as the
		// sub-trees
		BinaryTree t = new BinaryTree("Name of the Wind", l, r);
		return t;
	}

	public static BinaryTree testTree2() {
		BinaryTree s = new BinaryTree("The Chronicles of Narnia");
		s.attachToLeft("Lord of The Rings");
		s.attachToRight("Voyage to Arcturus");

		BinaryTree t = new BinaryTree("Wardstone Chronicles");
		t.attachToLeftSubtree(s);
		return t;
	}

	public static BinaryTree testTree3() {
		BinaryTree r = new BinaryTree("S");
		r.attachToLeft("P");
		r.attachToRight("W");

		BinaryTree l = new BinaryTree("D");
		l.attachToLeft("A");
		l.attachToRight("G");

		BinaryTree t = new BinaryTree("M", l, r);
		return t;
	}
}