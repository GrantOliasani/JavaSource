import java.util.ArrayList;

/**
 * This class generates substrings of a string.
 */
public class SubstringGenerator {
	public static ArrayList<String> getSubstrings(String word) {
		//this is the value you will return
		ArrayList<String> result = new ArrayList<String>();
		
		//come up with a base case first
		if (word.length() ==0){											//Base case we move towards 
			result.add(word);											//Add the word to result ArrayList
			return result;												//returns the ArrayList
		}
		
		
		// Below here is the recursive case
		// Form a simpler word by removing the first character
		else {

			String simplerWord= word.substring(1,word.length());		//Creates a substring of the word removing the first character
		

		// Generate all substrings of the simpler word
		// This is where you will make a recursive call
		// You can store the result from this temporary call in 
		// your results ArrayList
		
           result=getSubstrings(simplerWord); 							//recursive call to generate all substrings of simplerWord
            
        
		// Add all strings that start with word.charAt(0)
		// You will need a loop here
		for (int i=0; i<word.length();i++) {							//for loop adding all the substrings of the parameter word to the ArrayList
			result.add(word.substring(0,i+1));
			}
		}
				return result;											//returns all substrings

}
		
		}
