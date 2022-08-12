import java.util.NoSuchElementException;

/** A class implementing a linked list */
public class LinkedList<T> {
  
  /** the first node of the linked list */
  private LLNode<T> firstNode;
  
  /** Create an empty linked list */
  public LinkedList() {
    firstNode = null;
  }
  
  /** Retrieve the first node of the list */
  protected LLNode<T> getFirstNode() {
    return firstNode;
  }
  
  /** Change the first node of the list */
  protected void setFirstNode(LLNode<T> node) {
    firstNode = node;
  }
  
  /** 
   * Is the list empty?
   * @return true if the list contains no nodes
   */
  public boolean isEmpty() {
    return getFirstNode() == null;
  }
  
  /**
   * Add an element to the front of the linked list
   * @param element the element to add
   */
  public void addToFront(T element) {
    setFirstNode(new LLNode<T>(element, getFirstNode()));
  }
  
  /**
   * Remove and return the first node of the list
   * @return the first node of the list
   * @throws NoSuchElementException if the list is empty
   */
  public T removeFromFront() throws NoSuchElementException {
    if (!isEmpty()) {
      T save = getFirstNode().getElement();
      setFirstNode(getFirstNode().getNext());
      return save;
    }
    else
      throw new NoSuchElementException();
  }
}