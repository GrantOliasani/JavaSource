//Grant Oliasani
//Algorithms
//ETree Assignment
import java.util.Stack;
import java.util.Scanner;

public class ETree{
	 class TreeNode
	{
		public TreeNode left;
		public TreeNode right;
		public String value;

		public TreeNode(String item)
		{
			value=item;
			left=null;
			right=null;			

		}
	}


	
	private boolean isOperator(String c)
	{
		return c.equals('+') || c.equals('-')|| c.equals('*')|| c.equals('/');
	}
	

	public TreeNode build(String postfix)
	{
		postfix=postfix;

		Scanner sc=new Scanner(postfix);
		Stack<TreeNode> stack= new Stack<>();
		TreeNode t;
		TreeNode t1;
		TreeNode t2;
		while(sc.hasNext())
		{
			if(!sc.hasNextDouble())
			{
				t= new TreeNode(sc.next());
				t1=stack.pop();
				t2=stack.pop();

				t.right=t1;
				t.left=t2;

				stack.push(t);
			}
			
			else
			{
				t=new TreeNode(sc.next());
				stack.push(t);
			}
		}
		TreeNode root=stack.pop();
		return root;
	}

	public void printInfix(TreeNode t)
	{
		if(t!= null)
		{
			
			if(isOperator(t.value)==true)
			{
				System.out.print(t.value);
			}
			else
			{
			System.out.print("(");
			printInfix(t.left);
			System.out.print(t.value);
			printInfix(t.right);
			System.out.print(")");
			}
		}
	}

	public double evaluate(TreeNode t)
	{
		
		switch(t.value){
		case"+":
			return evaluate(t.left)+ evaluate(t.right);
		
		case"-":
			return evaluate(t.left)- evaluate(t.right);
		
		case"*":
			return evaluate(t.left)* evaluate(t.right);
		
		case"/":
			return evaluate(t.left)/ evaluate(t.right);
		
		
		}
			return Double.parseDouble(t.value);
		}
	
}