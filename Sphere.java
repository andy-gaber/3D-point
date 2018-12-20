/*
Class that creates a sphere object, which extends the shape class. The 
sphere will be created with a center point in 3D space, and will have methods 
that will calculate the surface area and volume of sphere. Class will also 
implement the comparable interface to compare this shape to another shape by 
volume.
*/

/**
 * A class the represent a Sphere object.
 */
public class Sphere extends Shape 
{
    private int x ;  // x coordinate of center
    private int y ;  // y coordinate of center
    private int z ;  // z coordinate of center
    private int radius ; // radius of sphere
    
    /**
     * Creates sphere object with center at (x,y,z), and a radius.
     * @param x the x coordinate of center.
     * @param y the y coordinate of center.
     * @param z the z coordinate of center.
     * @param radius the radius of sphere. 
     */
    public Sphere(int x, int y, int z, int radius)
    {
        super(x, y, z) ; // call Shape constructor
                         // center of sphere is (x,y,z)
        
        this.radius = radius ; // radius of sphere
    }
    
    /**
     * Returns the surface area of sphere
     * @return the surface area of sphere.
     */
    @Override
    public double getSurfaceArea()
    {
        // surface area sphere formula: 4 * PI * r^2
        double s = 4 * Math.PI * ( Math.pow(radius, 2) ) ;
        
        return s ;
    }
    
    /**
     * Returns the volume of sphere.
     * @return the volume of sphere.
     */
    @Override
    public double getVolume()
    {
        // volume sphere formula: 4/3 * PI * r^3
        double v = ( 4 * Math.PI * ( Math.pow(radius, 3) ) / 3.0 );
        
        return v ;
    }
    
    /**
     * Returns class name, center coordinate, radius, volume, and surface
     * area of sphere object.
     * @return class name, center coordinate, radius, volume, and surface
     * area of sphere object.
     */
    @Override
    public String toString()
    {
        return "Class:           " + getClass().getName() + // Sphere
                "\nCenter:          " + super.toString() +  // (x,y,z)
                "\nRadius:          " + radius +            // radius
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
