package lab2;

public class ArrayStack <T> implements StackADT<T>{

 private T[] stack;
 private int top;

 private final int DEFAULT_CAPACITY = 2;

 // Creates an empty stack using the default capacity
 public ArrayStack() {

  /* YOUR CODE HERE */
  
 }

 // Creates an empty stack using the specified capacity
 public ArrayStack(int initialCapacity) {
  
  /* YOUR CODE HERE */
  
 }

 // Adds the given element to the top of the stack (expands capacity if necessary)
 @Override
 public void push(T element) {

  /* YOUR CODE HERE */

 }

 // Removes the top item from the stack and returns it
 @Override
 public T pop() {

  /* YOUR CODE HERE */

  return null; //temporary, change this later
 }

 // Returns the top item
 @Override
 public T peek() {

  /* YOUR CODE HERE */

  return null; //temporary, change this later
 }

 // Returns true if the stack is empty and false otherwise
 @Override
 public boolean isEmpty() {

  /* YOUR CODE HERE */

  return false; //temporary, change this later
 }

 // Returns the number of elements in the stack
 @Override
 public int size() {

  /* YOUR CODE HERE */

  return 0; //temporary, change this later
 }

 // Returns a string representation of this stack
 @Override
 public String toString() {
  String str = "";
  for(int i = 0; i < top; i++) {
   str += stack[i].toString() + "\n";
  }
  return str;
 }
}