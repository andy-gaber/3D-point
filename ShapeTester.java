/*
Test Class for Point3D, Shape, and Shape Objects
*/

import java.util.Arrays ;
import java.util.Comparator ;

public class ShapeTester
{
    public static void main (String [] args)
    {
        Shape [] shapes = new Shape[4] ; // Array of shape objects
        
        // Sphere, center (2,-8,5), radius 13
        shapes[0] = new Sphere(2,-8,5,13) ; 
        
        // Parallelepiped, center (7,2,9), length 37, width 12, height 9
        shapes[1] = new Parallelepiped(7,2,9,37,12,9) ;
        
        // Cylinder, center (3,-4,5), radius 11, height 13
        shapes[2] = new Cylinder(3,-4,5,11,13) ;
        
        // Cone, center (-5,2,-1), radius 10, height 14
        shapes[3] = new Cone(-5,2,-1,10,14) ;
        
        // Print Shape objects with data
        System.out.println("\n* SHAPES *\n") ;
        
        for (int i = 0; i < shapes.length; i++)
        {
            System.out.println( shapes[i] ) ; // shape object
            System.out.println() ;
        }
        System.out.println("-------------------------------------\n") ;
        
        System.out.println("* ASCENDING BY VOLUME *\n") ;
        
        Arrays.sort(shapes) ; // Arrays sort method utilzes each classes 
                              // compareTo method to order shapes by volume,
                              // smallest to largest
        
        // Print Shape objects in ascending order by volume, display class name
        // and volume of each shape
        for (int i = 0; i < shapes.length; i++)
        {
            // Shape object class name
            System.out.println("Class:      " + shapes[i].getClass().getName()) ;
            // Shape object volume
            System.out.println("Volume:     " + shapes[i].getVolume() + "\n") ;
            
        }
        System.out.println("-------------------------------------\n") ;

        // Inner class implements comparator interface to compare one shape
        // object to another by distance of center from origin, in descending 
        // order
        class Descending implements Comparator
        {
            // Comparator interface, takes Objects as arguments
            @Override
            public int compare(Object one, Object two)
            {
                // Cast first Object as Shape object
                Shape shape1 = (Shape)one ;
                // distance from origin of first object
                double distance1 = shape1.getDistance() ;
                // Cast second Object as Shape object
                Shape shape2 = (Shape)two ;
                // distance from origin of seconds object
                double distance2 = shape2.getDistance() ;
                
                // if first shape distance is less than second shape distance 
                // return positive
                if (distance1 < distance2)
                    return 1 ;
                // if first shape distance is greater than seconds shape 
                // distance return negative
                else if (distance1 > distance2)
                    return -1 ;
                // if first and second shape distances are equal return 0
                else
                    return 0 ;
            }
        }
        
        Descending d = new Descending() ; // Comparator object
        
        Arrays.sort(shapes, d) ; // Array sort method sorting the shape array
                                 // utilizing a class that implements the 
                                 // comparator interface, ordering shapes by
                                 // distance from origin, farthest to closest
        
        System.out.println("* DESCENDING BY DISTANCE FROM ORIGIN *\n") ;
        
        // Print Shape objects in descending order by distance from origin,
        // display class name and distance of each shape
        for (int i = 0; i < shapes.length; i++)
        {
            // Shape object class name
            System.out.println("Class:          " + 
                    shapes[i].getClass().getName()) ;
            // Shape object distance from origin
            System.out.println("Distance:       " + 
                    shapes[i].getDistance() + "\n") ;
        }
    }
}
