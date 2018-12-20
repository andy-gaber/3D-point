/*
Class that creates a cone object, which extends the shape class.
The cone will be created with a center point in 3D space, and will have
methods that will calculate the surface area and volume of cone. Class will 
also implement the comparable interface to compare this shape to another shape 
by volume.
*/

/**
 * A class the represent a Cone object.
 */
public class Cone extends Shape
{
    private int x ; // x coordinate of center
    private int y ; // y coordinate of center
    private int z ; // z coordinate of center
    private int radius ; // radius of cone
    private int height ; // height of cone
    
    /**
     * Creates cone object with center at (x,y,z), and a radius and height.
     * @param x the x coordinate of center.
     * @param y the y coordinate of center.
     * @param z the z coordinate of center.
     * @param radius the radius of cone.
     * @param height the height of cone.
     */
    public Cone(int x, int y, int z, int radius, int height)
    {
        super(x, y, z) ;  // call Shape constructor
                          // center of cone is (x,y,z)
        this.radius = radius ; // radius of cone
        
        this.height = height ; // height of cone
    }
    
    /**
     * Returns the surface area of cone
     * @return the surface area of cone.
     */
    @Override
    public double getSurfaceArea()
    {
        // surface are formula cone: PI * r * ( r + Sqrt(r^2 + h^2) )
        double s = Math.PI * radius * 
                ( radius + Math.sqrt( Math.pow( height, 2 ) + Math.pow( radius, 2 ) ) ) ;
        
        return s ;
    }
   
    /**
     * Returns the volume of cone.
     * @return the volume of cone.
     */
    @Override
    public double getVolume()
    {
        // volume cone formula: (PI * r^2 * h) / 3
        double v = Math.PI * Math.pow( radius, 2 ) * ( height / 3.0 ) ;
        
        return v ;
    }
    
    /**
     * Returns class name, center coordinate, radius, height, volume, 
     * and surface area of cone object.
     * @return class name, center coordinate, radius, height, volume, 
     * and surface area of cone object.
     */
    @Override
    public String toString()
    {
        
        return "Class:           " + getClass().getName() + // Cone
                "\nCenter:          " + super.toString() +  // (x,y,z)
                "\nRadius:          " + radius +            // radius
                "\nHeight:          " + height +            // height
                "\nVolume:          " + this.getVolume() +  // volume
                "\nSurface area:    " + this.getSurfaceArea() ;  // surface area
    }
    
    /**
     * Implements comparable interface to compare this sphere object with 
     * another shape object by volume.
     * @param otherObject the other shape object that will be compared to this
     * shape object.
     * @return negative if first object is less than second object, positive if
     * first is greater than second object, 0 if first object and second 
     * object are equal...all determined by the volume of objects.
     */
    @Override
    public int compareTo(Object otherObject)
    {
        // cast Object argument as Shape object
        Shape other = (Shape)otherObject ;  
                        
        // if this volume is less than other volume return negative
        if (this.getVolume() < other.getVolume())   
            return -1 ;                              
        // if this volume is greater than other volume return positive
        else if ( this.getVolume() > other.getVolume() ) 
            return 1 ;                                  
        // if volume of this and other are equal return 0
        else
            return 0 ; 
    }
}
