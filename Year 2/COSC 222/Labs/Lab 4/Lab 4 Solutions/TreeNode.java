public class TreeNode {

    private String item;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(String newItem) {
        // Initializes tree node with item and no children.
        item = newItem;
        leftChild  = null;
        rightChild = null;
    }

    public TreeNode(String newItem, TreeNode left, TreeNode right) {
        // Initializes tree node with item and
        // the left and right children.
        item = newItem;
        leftChild  = left;
        rightChild = right;
    }

    public String getItem() {
        // Returns the item field.
        return item;
    }

    public void setItem(String newItem) {
        // Sets the item field to the new value newItem.
        item  = newItem;
    }

    public TreeNode getLeft() {
        // Returns the reference to the left child.
        return leftChild;
    }

    public void setLeft(TreeNode left) {
        // Sets the left child reference to left.
        leftChild  = left;
    }

    public TreeNode getRight() {
        // Returns the reference to the right child.
        return rightChild;
    }

    public void setRight(TreeNode right) {
        // Sets the right child reference to right.
        rightChild  = right;
    }

}  // end TreeNode