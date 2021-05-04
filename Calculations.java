
/**
 * This program is designed to display the sum, difference, quotient, product, and average of 2 predetermined numbers.
 * 
 * Author: Grant Oliasani 
 * Feb. 20 2013
 */
public class Calculations

{
    public static void main (String []args)
    {
      int firstnum = 8;
      int secondnum = 4;
      
      int sum= (firstnum + secondnum);
      int difference= (firstnum-secondnum);
      int quotient= (firstnum / secondnum);
      int product= (firstnum * secondnum);
      int average= ((firstnum + secondnum)/2);
      
      System.out.println(" The numbers are 8 and 4");
      System.out.println(sum + " is the sum");
      System.out.println(difference + " is the difference");
      System.out.println(quotient + " is the quotient");
      System.out.println(product + " is the product");
      System.out.println(average + " is the average");
    }
}
