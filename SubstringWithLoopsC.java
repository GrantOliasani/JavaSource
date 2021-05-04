import java.util.Scanner;
public class SubstringWithLoopsC{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your words");
		String words= sc.nextLine();
		int i =0;
		for(i=0; i<words.length();i++){
			char current = words.charAt(i);
			if(current== 't'){
				words= words.replace(current,'x');
			}
		}
		System.out.println(words);
	}
}