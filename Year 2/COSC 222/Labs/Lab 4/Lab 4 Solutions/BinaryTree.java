
public class BinaryTree  {

    protected TreeNode root;

    //Constructor 1 (Default)
    //Initializes an empty tree
    public BinaryTree() {
        /* DO NOT EDIT THIS METHOD */
        root = null;
    }

    //Constructor 2
    //Initializes the tree with a root
    public BinaryTree(String rootItem) {
        /* DO NOT EDIT THIS METHOD */
        root = new TreeNode(rootItem, null, null);
    }

    //Constructor 3
    //Initializes the tree with the root, left subtree and right subtree
    public BinaryTree(String rootItem, BinaryTree leftTree, BinaryTree rightTree) {
        /* DO NOT EDIT THIS METHOD */
        root = new TreeNode(rootItem, null, null);
        attachToLeftSubtree(leftTree);
        attachToRightSubtree(rightTree);
    }

    //Tree Traversal: In Order
    public void inorderTraversal(){
        /* DO NOT EDIT THIS METHOD */
        inorderRecursive(root);
    }

    //Tree Traversal: In Order (recursive)
    public void inorderRecursive(TreeNode current) {
        /* DO NOT EDIT THIS METHOD */
        if (current != null) {
            inorderRecursive(current.getLeft());
            System.out.println(current.getItem());
            inorderRecursive(current.getRight());
        }
    }

    //Attaches an item to the left branch
    public void attachToLeft(String newItem) {

        /* YOUR CODE HERE */

        if (root.getLeft()!=null)
            System.out.println("Error: left branch is already occupied");
        else
            root.setLeft(new TreeNode(newItem));

    }

    //Attaches an item to the right branch
    public void attachToRight(String newItem) {

        /* YOUR CODE HERE */

        if (root.getRight()!=null)
            System.out.println("Error: right branch is already occupied");
        else
            root.setRight(new TreeNode(newItem));

    }

    //Attaches a sub-tree to the left branch
    public void attachToLeftSubtree(BinaryTree leftTree) {

        /* YOUR CODE HERE */

        if(root.getLeft() != null)
            System.out.println("Error: right branch is already occupied");
        else
            root.setLeft(leftTree.root);

    }

    //Attaches a sub-tree to the right branch
    public void attachToRightSubtree(BinaryTree rightTree) {

        /* YOUR CODE HERE */

        if(root.getRight() != null)
            System.out.println("Error: right branch is already occupied");
        else
            root.setRight(rightTree.root);

    }

    //Returns the number of nodes in the tree.
    public int size(){

        /* YOUR CODE HERE */

        return sizeRecursive(root);

        //return 0; //temporary, change this later

    }

    //Recursive method to calculate the number of nodes.
    public int sizeRecursive(TreeNode node) {

        /* YOUR CODE HERE */

        if ((node.getLeft() == null) && (node.getRight() == null))
            return 1;
        else if ((node.getLeft() != null) && (node.getRight() == null))
            return 1+ sizeRecursive(node.getLeft());
        else if ((node.getLeft() == null) && (node.getRight() != null))
            return 1 + sizeRecursive(node.getRight());
        else
            return 1 + sizeRecursive(node.getLeft())  + sizeRecursive(node.getRight());


        //return 0; //temporary, change this later
    }

    //Returns the height of the tree
    public int height(){

        /* YOUR CODE HERE */

        return heightSubtree(root);

        //return 0; //temporary, change this later
    }

    public int heightSubtree(TreeNode current){

        /* YOUR CODE HERE */

        int height = -1;
        if (root == null)
            return height;
        else if (current !=null) {
            int leftHeight = heightSubtree(current.getLeft());
            int rightHeight = heightSubtree(current.getRight());
            height = 1 + Math.max(leftHeight, rightHeight);
        }
        return height;

        //return 0; //temporary, change this later
    }
}