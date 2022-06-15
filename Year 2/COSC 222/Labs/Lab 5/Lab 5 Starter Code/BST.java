public class BST{
  private TreeNode root; // The root of the tree.

  //======================================
  //  Creates an empty binary search tree.
  //======================================
  public BST()
  {
    root = null;
  }

  //================================================================
  //  Add the specified item to the binary search tree in the
  //  appropriate position according to its key value.
  //================================================================
  public void insert(int newItem)
  {

    /* YOUR CODE HERE */


  } // end insert


  //================================================================
  //  Traverse the tree in-order and show value in the binary
  //  search tree.
  //================================================================
  public void printTree()
  {
    if(root == null)
      System.out.println( "Empty tree." );
    else
    {
      inorderPrint(root);
    }
  }

  //A recursive function to show data in-order
  public void inorderPrint(TreeNode current) {
    if (current != null) {
      inorderPrint(current.left);
      System.out.print(current.data + " ");
      inorderPrint(current.right);
    }
  }

  //================================================================
  //  Traverse the tree and show the data in in in-order and show value
  //  in descending order.
  //================================================================
  public void printTreeDesc()
  {
    if(root == null)
      System.out.println( "Empty tree." );
    else
    {
      recPrintTreeDesc(root);
    }
  }

  //============================================
  //  A recursive method to to show data in in descending order
  //============================================
  public void recPrintTreeDesc(TreeNode current) {

    /* YOUR CODE HERE */



  }

  //============================================
  //  Traverse the tree and print the leaf nodes
  //============================================
  public void printLeafs(){
    recursivePrintLeafs(root);
  }

  //============================================
  //  A recursive method to print the leaf
  //============================================
  public void recursivePrintLeafs(TreeNode node) {

    /* YOUR CODE HERE */


  }

  //============================================
  //  Traverse the tree and print the internal nodes
  //============================================
  public void printInternalNodes(){
    recursiveInternalNodes(root);
  }

  //=================================================
  //  A recursive method to print the internal nodes
  //=================================================
  public void recursiveInternalNodes(TreeNode node) {

    /* YOUR CODE HERE */


  }

  //===============================================
  //  Count the number of items under a given key
  //===============================================
  public int countNodes(int key){
    TreeNode node = search(key);
    if (node == null)
      return -1;
    else
      return recursiveCountNodes(node);
  }

  //=================================================
  //  A recursive method to count the number of nodes
  //=================================================
  public int recursiveCountNodes(TreeNode node) {

    /* YOUR CODE HERE */


    return 0; //temporary, change this later
  }


  //=================================================
  //  Find the minimum value stored in the subtree
  //  rooted at a given key value
  //=================================================
  public TreeNode findSmallest(int item){

    /* YOUR CODE HERE */


    return null; //temporary, change this later
  }

  //=================================================
  //  This function returns if the binary tree
  //   is perfect or not
  //=================================================
  public boolean isPerfectTree(){
      // An empty tree is perfect
      if (root == null){
          return true;
      }

      /* YOUR CODE HERE */

      return false; //temporary, change this later
  }

  public void printIsPerfectTree(){
      if(this.isPerfectTree()){
          System.out.println("Tree is Pefect");
        }
        else {
          System.out.println("Tree is NOT Pefect");
        }
  }
  
  //=================================================
  //  This function returns if the binary tree
  //   is complete or not
  //=================================================

  public boolean isCompleteTree(){
       /* YOUR CODE HERE */

       return false; //temporary, change this later
  }


  public void printIsComplete(){
      if(this.isCompleteTree()){
          System.out.println("Tree is Complete");
        }
        else {
          System.out.println("Tree is NOT Complete");
        }
  }


  //=================================================
  //  This function returns if the binary tree
  //   is full or not
  //=================================================
  public boolean isFullTree(){
    // An empty tree is perfect
      if(root == null){
          return true;
      }

      /* YOUR CODE HERE */

      return false; //temporary, change this later
  }

  public void printIsFullTree(){
      if(this.isFullTree()){
          System.out.println("Tree is Full");
        }
        else {
          System.out.println("Tree is NOT Full");
        }
  }


  //=================================================
  //  This function returns the height of the tree
  //=================================================
  public int getHeight(){
      /* YOUR CODE HERE */

      return 0; //temporary, change this later
  }


  //=================================================
  //  This function returns if the binary tree
  //   is Degenerate or not
  //=================================================
  public boolean isDegenerateBinaryTree(){
      /* YOUR CODE HERE */

      return false; //temporary, change this later
  }

  public void printIsDegenerateTree(){
      if(this.isDegenerateBinaryTree()){
          System.out.println("Tree is Degenerate");
        }
        else {
          System.out.println("Tree is NOT Degenerate");
        }
  }


  //=================================================
  //  An iterative code to search an item in a tree
  //=================================================
  public TreeNode search(int key){

    TreeNode current = root;
    boolean found = false;
    while ((current != null) && (!found)){
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