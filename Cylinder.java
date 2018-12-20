/*
Class that creates a cylinder object, which extends the shape class.
The cylinder will be created with a center point in 3D space, and will have
methods that will calculate the surface area and volume of cylinder. Class will 
also implement the comparable interface to compare this shape to another shape 
by volume.
*/

/**
 * A class the represent a Cylinder object.
 */
public class Cylinder extends Shape
{
    private int x ; // x coordinate of center
    private int y ; // y coordinate of center
    private int z ; // z coordinate of center
    private int radius ; // radius of cylinder
    private int height ; // height of cylinder
    
    /**
     * Creates cylinder object with center at (x,y,z), and a radius and height.
     * @param x the x coordinate of center.
     * @param y the y coordinate of center.
     * @param z the z coordinate of center.
     * @param radius the radius of cylinder.
     * @param height the height of cylinder.
     */
    public Cylinder(int x, int y, int z, int radius, int height)
    {
        super(x, y, z) ;  // call Shape constructor
                          // center of cylinder is (x,y,z)
        this.radius = radius ; // radius of cylinder
        
        this.height = height ; // height of cylinder
    }
    
    /**
     * Returns the surface area of cylinder
     * @return the surface area of cylinder.
     */
    @Override
    public double getSurfaceArea()
    {
        // surface area formula cylinder: ( 2 * PI (r^2) ) + ( 2 * PI * r * h )
        double s =  ( 2 * Math.PI * ( Math.pow(radius, 2) ) ) + 
                    ( 2 * Math.PI * radius * height ) ;
        return s ;
    }
    
    /**
     * Returns the volume of cylinder.
     * @return the volume of cylinder.
     */
    @Override
    public double getVolume()
    {
        // volume formula cylinder: (PI * r^2 * h)
        double v = Math.PI * Math.pow(radius, 2) * height ;
        
        return v ;
    }
    
    /**
     * Returns class name, center coordinate, radius, height, volume, 
     * and surface area of cylinder object.
     * @return class name, center coordinate, radius, height, volume, 
     * and surface area of cylinder object.
     */
    @Override
    public String toString()
    {
        return "Class:           " + getClass().getName() + // Cylinder
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
        if ( this.getVolume() < other.getVolume() )   
            return -1 ;                              
        // if this volume is greater than other volume return positive
        else if ( this.getVolume() > other.getVolume() ) 
            return 1 ;                                  
        // if volume of this and other are equal return 0
        else
            return 0 ; 
    }
}
