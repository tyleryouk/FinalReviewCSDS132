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
    setFirstNode(new LLNode<>(element, getFirstNode()));
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
  
  /**
   * insert an element into a sorted list, insert into the correct location
   * @param element the element to insert
   * @param list a linked list with the elements already in sorted order
   */
  public static <S extends Comparable<? super S>> void insertInOrder(S element, LinkedList<S> list) {
    // 1. the element goes at the front of the list
    if (list.isEmpty() || (element.compareTo(list.getFirstNode().getElement()) < 0))
      list.addToFront(element);
      
    // 2. the element goes after the front of the list
    else {
      LLNode<S> nodeptr = list.getFirstNode();
      while (nodeptr.getNext() != null && nodeptr.getNext().getElement().compareTo(element) < 0)
        nodeptr = nodeptr.getNext();
      // we stop when the next element is larger than element or we are at the last node
      nodeptr.setNext(new LLNode<>(element, nodeptr.getNext()));
    }
  }

}