import java.util.Comparator;

public class CompareByManhattanDistanceScratch implements Comparator<Point2D>{
  
  /** Compute the Manhattan distance for a point */
  private double manhattanDistance(double point1, double point2){
    return Math.abs(point.getX()) + Math.abs(point.getY());  //absolute value distance
  }
  //That is, if point1 is smaller than point2, then the sum of the absolute values of point1's x and y coordinates 
  //is smaller than the sum of the absolute values of point2's x and y coordinates.  
  //Make your Comparator a static nested class, and then create a method that returns an instance of that class.
  
  /**
     * Compares two points by Manhattan distance
     * @param point1 the first point
     * @param point2 the second point
     * @return <0, =0, >0, if the first point has less, equal, or greater Manhattan
distance from the origin than the second point
     */
  
   public int compare(Point2D point1, Point2D point2
  
   public int compare(Point2D point1, Point2D point2) {
      double point1Dist = manhattanDistance(point1);
      double point2Dist = manhattanDistance(point2);
      
      if (point1Dist < point2Dist)
        return -1;
      else if (point1Dist > point2Dist)
        return 1;
      else
        return 0;
    }
}