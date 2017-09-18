// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP_5
{
  //Instance variables ************************************************

//  nothing as there is no overlap in variable name between the 2 subclasses 
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP_5(char type, double xOrRho, double yOrTheta)
  {
    PointCP_5 p = new PointCP_5();
    if (type == 'C')
      p = new PointCP_3(xOrRho, yOrTheta);
    if (type == 'P')
      p = new PointCP_2(xOrRho, yOrTheta);
    
    this = p;
  }
  
  //  dummy constructor
  public PointCP_5() {
  }
 
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
    return 0;
  }
  
  public double getY()
  {
    return 0;
  }
  
  public double getRho()
  {
    return 0;
  }
  
  public double getTheta()
  {
    return 0;
  }
  
 
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public void convertStorageToPolar()
  {
    this = new PointCP_2(this.getRho(), this.getTheta());
  }
 
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian()
  {
    this = new PointCP_3(this.getX(), this.getY());
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP_5 pointB)
  {
    return null;
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP_5 rotatePoint(double rotation)
  {
    return null;
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return null;
  }
}
