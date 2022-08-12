import java.util.*;

public class Point2D {
 
  /**Create a class Point2D that consists of two doubles, x and y.  Use proper object-oriented coding.  
    * Then create a Comparator that compares two Point2D values by "Manhattan Distance".  That is, if point1 is smaller than point2, 
    * then the sum of the absolute values of point1's x and y coordinates is smaller than the sum of the absolute values of point2's x and y coordinates.  
    * Make your Comparator a static nested class, and then create a method that returns an instance of that class. */
  
  /** Instance Variables */
  private double x;
  private double y;
  
  /** Constructor */
  public Point2D(double xI, double yI){
    x = xI;
    y = yI;}
  
  /** Getter/Setter methods */
  public double getX(){return x;}
  public double getY(){return y;}
  public void setX(double newX){x = newX;}
  public void setY(double newY){y = newY;}
  
  /** comparator that compares two Point2D values */
  public static Comparator<Point2D> compareByManhattanDistance(){
    return new CompareByManhattanDistance();
  }

  
  /** Static class */
  private static class CompareByManhattanDistance implements Comparator<Point2D> {
    
    //Taking manhattan distance of single point
    private double manhattanDistance(Point2D point){
      return ( Math.abs(point.getX()) + Math.abs(point.getY()) );
    }
    
    
    public int compare(Point2D point1, Point2D point2){
      double point1Dist = manhattanDistance(point1);
      double point2Dist = manhattanDistance(point2);
      
      if(point1Dist < point2Dist){ return -1; }
      else if (point1Dist > point2Dist) {return 1; }
      else { return 0; }
      
    }
  }

  
    public static void main (String[] args){
     
    Point2D pointA = new Point2D(1.0, 6.0);
    Point2D pointB = new Point2D(6.0, 6.0);
    
    Comparator<Point2D> comparePoints = Point2D.compareByManhattanDistance();
    Integer compareInteger = comparePoints.compare(pointA, pointB);
    System.out.println(compareInteger);
    
    Comparator<Point2D> comparePointsPNorm = Point2D.compareByPNorm(3);
    Integer comparePNormInt = comparePointsPNorm.compare(pointA, pointB);
    System.out.println(comparePNormInt);
  }
    
    /**Add a static method compareByPNorm to your Point2D class.  
      * The method should take an integer p as input, and the method will return a Comparator for Point2D that orders points by their p-norm.  
      * To compute the p-norm of a point, you take the absolute value of each x and y, raise that value to the p-th power, and then add those values together.  
      * To compute the actual p-norm, you need to then take the p-th root of that sum, but to get the Comparator working, the p-th root is not necessary.  
      * You should implement the Comparator as an anonymous class. */
    public static Comparator<Point2D> compareByPNorm(Integer pInput){ //returns a comparator
      
      final Integer p = pInput;
      return new Comparator<Point2D>(){ 
        
        private double pNorm(Point2D point) {
          double absValueX = Math.abs(point.getX());
          double absValueY = Math.abs(point.getY());
          double pNorm = Math.pow(absValueX, p) + Math.pow(absValueY, p);
          return pNorm;
        }
        
        @Override
        public int compare(Point2D pointA, Point2D pointB){
          return (int) (pNorm(pointA) - pNorm(pointB));
        }
      };
    }
  
}