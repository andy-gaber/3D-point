/*
Super class to represent a point in three dimensional space with 
coordinates x, y, and z.
*/

/**
 * Class that creates a point in three dimensional space.
 */
public class Point3D
{
    private int x ;  // x corrdinate
    private int y ;  // y corrdinate
    private int z ;  // z coordinate
    
    /**
     * Creates a point in three dimensional space.
     * @param x the x coordinate.
     * @param y the y coordinate.
     * @param z the z coordinate.
     */
    public Point3D(int x, int y, int z)
    {
        this.x = x ;
        this.y = y ;
        this.z = z ; 
    }
   
    /**
     * Returns the x coordinate.
     * @return the x coordinate.
     */
    public int getX()
    {
        return x ;
    }
    
    /**
     * Returns the y coordinate.
     * @return the y coordinate.
     */
    public int getY()
    {
        return y ;
    }
    
    /**
     * Returns the z coordinate.
     * @return the z coordinate.
     */
    public int getZ()
    {
        return z ;
    }
    
    /**
     * Returns the three dimensional point in coordinate form (x,y,z).
     * @return the coordinate (x,y,z).
     */
    @Override
    public String toString()
    {
        return "(" + x + "," + y + "," + z + ")" ;
    }
}
