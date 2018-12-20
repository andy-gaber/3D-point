/*
Abstract class inherited from Point3D class that creates a shape object
with a point in three dimensional space that will be the center of the Shape 
object. This class will also allow child classes to inherit a method to 
calculate the distance from center point to origin (0,0,0), and also methods to 
calculate the surface area and volume, as well as the comparable interface to 
compare with other shapes.
*/

/**
 * Class that extends Point3D class to represent a shape with a point in 3D 
 * space that is the center of the shape object.
 */
public abstract class Shape extends Point3D implements Comparable
{
    private Point3D center ; // coordinates of the center of shape object
    
    /**
     * Creates a shape with x, y, and z coordinates at center of the shape.
     * @param x the x coordinate of center.
     * @param y the y coordinate of center.
     * @param z the z coordinate of center.
     */
    public Shape(int x, int y, int z)
    {
        super(x, y, z) ; // call Point3D constructor
        center = new Point3D(x, y, z) ; // center of object will get x, y, z inputs
    }
    
    /**
     * Calls inherited toString to print the coordinates of center shape object 
     * as (x,y,z).
     * @return the coordinates of the center of the shape.
     */
    @Override
    public String toString()
    {
        return super.toString() ;
    }
    
    /**
     * Returns the distance of shape center point from origin (0,0,0).
     * @return the distance of shape center point from origin. 
     */
    public double getDistance()
    {
        // Square root of [ (x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2 ]
        // Where x1, y1, z1 are always equal to origin (0,0,0)
        double distance = Math.sqrt( Math.pow( center.getX(), 2 ) + 
                   Math.pow( center.getY(), 2 ) + Math.pow( center.getZ(), 2 ) ) ;
        
        return distance ;
    }
    
    /**
     * Returns the surface area of the inherited shape.
     * @return the surface area of the inherited shape.
     */
    public abstract double getSurfaceArea() ;
    
    /**
     * Returns the volume of the inherited shape.
     * @return the volume of the inherited shape.
     */
    public abstract double getVolume() ;
    
    /**
     * Compares one shape object to another; natural ordering to be determined
     * by each individual object.
     * @param otherObject the other shape object that will be compared to this
     * shape object.
     * @return negative if first object comes before second object, positive if
     * first object comes after second object, 0 if first object and second 
     * object are equal...all determined by the natural ordering.
     */
    @Override
    public abstract int compareTo(Object otherObject) ;
}