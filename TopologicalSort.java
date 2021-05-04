//Grant Oliasani
//ddq517
//Algorithms

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class TopologicalSort{
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		String line;

		int count= sc.nextInt();

		int graph[][]= new int[count][count];
		int[] inDegreeArray= new int[count];
		ArrayList<Integer> sortedArray= new ArrayList<>();
		sc.nextLine();
		while((line=sc.nextLine()).length()>0){
			Scanner lineScanner= new Scanner(line);
			while(lineScanner.hasNext()){
		int source= lineScanner.nextInt();
		int destination=lineScanner.nextInt();
		graph[source][destination]=1;
		}
	}
		for(int i=0; i<count; i++){
			for(int j=0; j<count; j++){
			inDegreeArray[j]+= graph[i][j];
		}
	}
	System.out.println(Arrays.deepToString(graph));
	System.out.println(Arrays.toString(inDegreeArray));

	for(int k=0; k<count;k++){
		if (inDegreeArray[k]==0)
		{
			
			sortedArray.add(k);
		
		for(int v=0; v<count; v++){
			inDegreeArray[k]=-1;

			if(graph[k][v]==1)
			{
				inDegreeArray[v]=inDegreeArray[v]-1;
			}
		}
		}
	}


	if(sortedArray.size()!=count)
	{
		System.out.println("A cycle has been detected.");
	}
	else
		System.out.println(sortedArray);
	}
}