
public class LLNodeChallenge {
 
  /**Using the LLNode class from the module, attempt the following in order:

1) Create an LLNode storing the int value 3.

2) Create an LLNode storing the int value 1, and place that node in front of the node containing 3.

3) Create an LLNode storing the int value 2, and place that node after the node containing 1, but before the node containing 3.

Take your time to code it.  You can if the values are stored correctly by using node.getElement(), node.getNext().getElement(), and node.getNext().getNext().getElement(). */
  
  public static void main(String[] args){
    
    
    LinkedList<Integer> runUp = new LinkedList<Integer>();
    LLNode<Integer> node8 = new LLNode<Integer>(8, new LLNode<Integer>(10, null)); //element = 8, next node.element
    LLNode<Integer> node10 = node8.getNext();
    runUp.setFirstNode(node8);
    
    
    System.out.println(runUp.getFirstNode().getElement());
    System.out.println(node10.getElement());
    
    runUp.swapFirstTwo();
    System.out.println(runUp.getFirstNode().getElement());
    System.out.println(runUp.getFirstNode().getNext().getElement()); //works
    
  }
  
}