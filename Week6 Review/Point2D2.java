import java.util.Comparator;

/**Take your Point2D class and create a Comparator for it that compares two points and orders them by which one is closest to "this" point by Euclidean distance.  
  * To compute the Euclidean distance of two points, you square the difference of the x values and add that to the square of the difference of the y values.  
  * (Technically, you have to take the square root of that value, but that won't change which one is closer.)  Write the Comparator as a non-static nested class, 
  * and write a method that returns an instance of the Comparator. */

/** Points in two dimensions */
public class Point2D2 {
  
  /**
   * Return a comparator the compares two points by there Euclidean distance from 
this point.
   * @return a comparator for two points
   */
  public Comparator<Point2D> compareByDistanceFromHere() {
    return new CompareByDistanceFromHere();
  }
  
  /** A class that is a Comparator.  Compares two points by their Euclidean 
distance from a set point. */
  private class CompareByDistanceFromHere implements Comparator<Point2D> {
    
    /** Computes the Euclidean distance between two points */
    private double euclideanDistance(Point2D pointA, Point2D pointB) {
      return (pointA.getX() - pointB.getX()) * (pointA.getX() - pointB.getX()) +
             (pointA.getY() - pointB.getY()) * (pointA.getY() - pointB.getY());
    }
    
    /**
     * Compares two points by their Euclidean distance from a set point, "this" 
point
     * @param point1 the first point to compare
     * @param point2 the second point to compare
     * @return <0, =0, >0 if the first point is closer, the same distance, or 
further from "this" point by Euclidean distance.
     */
    public int compare(Point2D point1, Point2D point2) {
      double point1Dist = euclideanDistance(point1, Point2D.this);
      double point2Dist = euclideanDistance(point2, Point2D.this);
      
      if (point1Dist < point2Dist)
        return -1;
      else if (point1Dist > point2Dist)
        return 1;
      else
        return 0;
    }
  }
  
  /**
   * Returns a Comparator that compares two points by their p-norm from the origin.
   * @param p the parameter of the p-norm that we are using
   * @return a Comparator that compares two points by their p-norm from the origin.
   */
  public static Comparator<Point2D> compareByPNorm(int p) {
    return new Comparator<Point2D>() {
      
      // computes the p-norm of a point
      private double pNorm(Point2D point) {
        return Math.pow(Math.abs(point.getX()), p) + 
          Math.pow(Math.abs(point.getY()), p);
      }
      
      // compares the two points using the p-norm function above.
      public int compare(Point2D point1, Point2D point2) {
        double point1Dist = pNorm(point1);
        double point2Dist = pNorm(point2);
        
        if (point1Dist < point2Dist)
          return -1;
        else if (point1Dist > point2Dist)
          return 1;
        else
          return 0;
      }
      
    };
  }
   
  
}
