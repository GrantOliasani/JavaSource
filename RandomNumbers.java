
/**
 * This program is designed to offer the user 6 lottery numbers chosen at random.
 * 
 * Author: Grant Oliasani 
 * Feb. 20 2013
 */
import java.util.Random;
public class RandomNumbers
{
    public static void main (String[] args) {
       Random randomgenerator= new Random();
       randomgenerator.nextInt(49);
       System.out.println("Play these lottery numbers! They will make you rich!");
       int myRand= randomgenerator.nextInt(49)+1;;
       System.out.println(myRand);
       int myRand2= randomgenerator.nextInt(49)+1;
       System.out.println(myRand2);
       int myRand3= randomgenerator.nextInt(49)+1;
       System.out.println(myRand3);
       int myRand4= randomgenerator.nextInt(49)+1;
       System.out.println(myRand4);
       int myRand5= randomgenerator.nextInt(49)+1;
       System.out.println(myRand5);
       int myRand6= randomgenerator.nextInt(49)+1;
       System.out.println(myRand6);
       
      
      
    }
}