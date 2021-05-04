
/**
 * This program is designed to calculate and display the perimeter of a generated rectangle.
 * 
 * Author: Grant Oliasani 
 * Feb. 20 2013
 */
import java.awt.Rectangle;
public class PerimiterTester
{
    public static void main (String[] args) {
       Rectangle myRectangle= new Rectangle(8,10,20,5);
       double Height = myRectangle.getHeight();
       double Width = myRectangle.getWidth();
       
       double Perimeter= ((Height*2)+(Width*2));
       System.out.println("The Perimeter of the rectangle is "+ Perimeter);
       
       
        
        
        
        
        
    }
}


