import java.util.LinkedList;
import javax.swing.JFrame;

public class ListStuff {
  
  /** print the contents of a linked list */
  public static void printList(LinkedList<?> list) {
    for (Object element : list) {
      System.out.println(element);
    }
  }
  
  /** add an element to the list */
  public static <T> void insert(T element, LinkedList<T> list) {
    list.add(0, element);
  }
  
  /** display all the JFrames in a linked list */
  public static void displayFrames(LinkedList<? extends JFrame> list) {
    for (JFrame frame : list) {
      frame.setVisible(true);
    }
  }
 
}