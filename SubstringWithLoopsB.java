import java.util.Scanner;
public class SubstringWithLoopsB{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your words");
		String words= sc.nextLine();
		int i =0;
		for(i=0; i<words.length();i++){
			char current = words.charAt(i);
			if(current== 'a'|| current== 'e'||current== 'i'||current== 'o'||current== 'u'||current== 'y'){
				words= words.replace(current,'_');
			}
		}
		System.out.println(words);
	}
}