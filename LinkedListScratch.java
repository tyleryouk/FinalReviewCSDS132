import java.util.NoSuchElementException;

public class LinkedListScratch<T> {
  
  /** Instance Variables */
  private LLNode<T> startNode = new LLNode<T>();
  
  /** Constructors */
  public LinkedListScratch<T>(){
    startNode = null; 
  }
  
  protected LinkedListScratch<T>(LLNode<T> sNode){
    startNode = sNode; 
  }
  
  /** Retrieve the first node of the list */
  protected LLNode<T> getFirstNode(){
    return startNode; 
  }
  
  /** Change the first node of the list */
  protected void setFirstNode(LLNode<T> newNode){
    startNode = newNode;
  }
  
  /** 
   * Is the list empty?
   * @return true if the list contains no nodes
   */
  public boolean isEmpty() {
    if(getFirstNode() == null){ //always use getter methods
      return true; 
    }  else { return false; }
  }
 

  
  
  
  
  /**
   * Add an element to the front of the linked list
   * @param element the element to add
   */
  
  public void addElement(T element){
    LLNode<element> nextNode = new LLNode<element>(): 
    setFirstNode(nextNode); 
  }
  
  /**
   * Remove and return the first node of the list
   * @return the first node of the list
   * @throws NoSuchElementException if the list is empty
   */

  
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
