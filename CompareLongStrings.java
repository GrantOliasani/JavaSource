import java.util.Scanner;
public class CompareLongStrings{
public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the first sentence");
String word1= sc.nextLine();
System.out.println("Enter the second sentence");
String word2= sc.nextLine();

//Use loops 
if(word1.equals(word2)){

	System.out.println("The sentences are the same");
}
else{

	System.out.println("The sentences are different");
}

}
}