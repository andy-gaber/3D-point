/*
Class that creates a Parallelepiped object, which extends the shape 
class. The Parallelepiped will be created with a center point in 3D space, and 
will have methods that will calculate the surface area and volume of 
Parallelepiped. Class will also implement the comparable interface to compare 
this shape to another shape by volume.
*/

/**
 * A class the represent a Parallelepiped object.
 */
public class Parallelepiped extends Shape
{
    private int x ;  // x coordinate of center
    private int y ;  // y coordinate of center
    private int z ;  // z coordinate of center
    private int length ; // length of parallelepiped
    private int width ;  // width of parallelepiped
    private int height ; // height of parallelepiped
    
    /**
     * Creates parallelepiped object with center at (x,y,z), and a length, 
     * width, and height.
     * @param x the x coordinate of center.
     * @param y the y coordinate of center.
     * @param z the z coordinate of center.
     * @param length the length of parallelepiped.
     * @param width the width of parallelepiped.
     * @param height  the height of parallelepiped.
     */
    public Parallelepiped(int x, int y, int z, int length, int width, 
                          int height)
    {
        super(x, y, z) ;  // call Shape constructor
                          // center of parallelepiped is (x,y,z)
        this.length = length ;   // length of parallelepiped.  
        
        this.width = width ;     // width of parallelepiped.
        
        this.height = height ;   // height of parallelepiped.
    }
    
    /**
     * Returns the surface area of parallelepiped
     * @return the surface area of parallelepiped.
     */
    @Override
    public double getSurfaceArea()
    {
        // surface area parallelepied formula: 2 [ (l * h) + (w * h) + (l * w) ]
        double s =  ( 2 * length * height ) + ( 2 * width * height ) + 
                    ( 2 * length * width ) ;
        return s ;
    }
   
    /**
     * Returns the volume of parallelepiped.
     * @return the volume of parallelepiped.
     */
    @Override
    public double getVolume()
    {
        // volume parallelepiped formula: ( l * w * h )
        double v = length * width * height ;
        
        return v ;
    }
    
    /**
     * Returns class name, center coordinate, length, width, height, volume, 
     * and surface area of parallelepiped object.
     * @return class name, center coordinate, length, width, height, volume, 
     * and surface area of parallelepiped object.
     */
    @Override
    public String toString()
    {
        return "Class:           " + getClass().getName() + // parallelepiped
                "\nCenter:          " + super.toString() +  // (x,y,z)
                "\nLength:          " + length +            // length
                "\nWidth:           " + width +             // width
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
