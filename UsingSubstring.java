import java.util.Scanner;
public class UsingSubstring{
	public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	//Get word from user
	System.out.println("Enter your word:");
	String inputtext = input.nextLine();

	for(int i = 0; i < inputtext.length(); i++) {
	System.out.print(inputtext.charAt(i) + " ");
} 
	   }
	
}