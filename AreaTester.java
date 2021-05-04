
/**
 * This program is designed to calculate the are of a designated rectangle.
 * 
 * Author: Grant Oliasani 
 * Feb. 20 2013
 */
import java.awt.Rectangle;
public class AreaTester
{
    public static void main (String[] args) {
       Rectangle myRectangle= new Rectangle(8,10,20,5);
       double Height = myRectangle.getHeight();
       double Width = myRectangle.getWidth();
       
       double Area= (Height*Width);
       System.out.println("The area of the rectangle is "+ Area);
       
       
        
        
        
        
        
    }
}
