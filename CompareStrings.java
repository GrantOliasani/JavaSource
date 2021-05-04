import java.util.Scanner;
public class CompareStrings{
public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string");
String word1= sc.nextLine();
System.out.println("Enter the second string");
String word2= sc.nextLine();

//Use loops 
if(word1.equals(word2)){

	System.out.println("The words are the same");
}
else{

	System.out.println("The words are different");
}

}
}