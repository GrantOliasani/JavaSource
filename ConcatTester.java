
/**
 * This program is designed to join words together using the concat method.
 * 
 * Author: Grant Oliasani 
 * Feb. 20 2013
 */
public class ConcatTester
{
   public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        
        String s = article.concat(" "+animal1).concat(" "+action).concat(" "+article).concat(" "+animal2);
        
        System.out.println(s);
        System.out.println("The phrase is "+s.length() + " characters long");
    }
}
