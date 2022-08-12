import java.util.NoSuchElementException;

public class LinkedListScratch<T> {

  /** Instance Variables: the first node of the linked list */
  private LLNode<T> firstNode;
  
  /** Constructor: Create an empty linked list */
  public LinkedListScratch(){
    firstNode = null;
  }
  
  /** Setter and Getter methods */
  protected LLNode<T> getFirstNode(){return firstNode;}
  protected void setFirstNode(LLNode<T> setter){firstNode = setter;}
  
  
  
  /**
   * Remove and return the first node of the list
   * @return the first node of the list
   * @throws NoSuchElementException if the list is empty
   */
  public T removeFromFront() throws NoSuchElementException { //throws NoSuchElementException - if the list is empty 
    if (!isEmpty()) {
      T save = getFirstNode().getElement();
      setFirstNode(getFirstNode().getNext());
      return save;
    }
    else
      throw new NoSuchElementException();
  }
  
  /** swapFirstTwo: that swaps the first two nodes (not elements) of the linked list:  If the list is empty or has only one node, the method should do nothing.
    * Draw a picture of the nodes to help you see which "arrow" have to change and the order you need to change them.  Once you have your solution, you can compare it with mine:  */
  
  public void swapFirstTwo() {
  if (!isEmpty() && getFirstNode().getNext() != null) {
    LLNode<T> save = getFirstNode().getNext();
    getFirstNode().setNext(save.getNext());
    save.setNext(getFirstNode());
    setFirstNode(save);
  }
}

}