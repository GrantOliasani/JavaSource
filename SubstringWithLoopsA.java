import java.util.Scanner;
public class SubstringWithLoopsA{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your words");
		String words= sc.nextLine();
		int i =0;
		for(i=0; i<words.length();i=i+2){
			char current= words.charAt(i);
			System.out.println(current);
		}
	}
}