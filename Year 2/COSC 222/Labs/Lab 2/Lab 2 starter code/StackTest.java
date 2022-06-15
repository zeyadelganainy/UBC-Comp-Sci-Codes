package lab2;
import lab2.Lake;

public class StackTest {

 public static void main(String[] args) {
  StackADT<Lake> arrayStack = new ArrayStack<Lake>();
  System.out.println("*** Lakes with Array Stack ***");
  test(arrayStack);
  
  StackADT<Lake> linkedListStack = new LinkedListStack<Lake>();
  System.out.println("*** Lakes with Linked List Stack ***");
  test(linkedListStack);
 }
 
 private static void test(StackADT<Lake> stack) {
  stack.push(new Lake("Lake Superior", "Ontario", 209800.10, 183.50));
  stack.push(new Lake("Lake Huron", "Ontario", 193700.20, 176.20));
  stack.pop();
  stack.pop();
  stack.pop();
  stack.push(new Lake("Okanagan Lake", "British Columbia", 351.00, 342.21));
  System.out.println("Stack size: " + stack.size());
  System.out.println("The stack contents:\n" + stack);
  stack.pop();
  stack.push(new Lake("Lake Erie", "Ontario", 103700.90, 173.70));
  System.out.println("Stack size: " + stack.size());
  System.out.println("The stack contents:\n" + stack);
 }
}
