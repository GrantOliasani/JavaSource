//Grant Oliasani
//Algorithms
//ETree Assignment
import java.util.Scanner;
public class ETreeDriver extends ETree{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String postfix;

		while((postfix=sc.nextLine()).length()>0){

			
		ETree et = new ETree();
		TreeNode root= et.build(postfix);
		System.out.println("Infix= ");
		et.printInfix(root);
		System.out.println();
		System.out.println("Answer= ");
		System.out.println(et.evaluate(root));
	
	}
	}
}