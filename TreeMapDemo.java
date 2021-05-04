//Grant Oliasani
//DDQ517
//Algorithms
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;

public class TreeMapDemo{
	public static void main(String []args){
		TreeMap<String,Integer>tmap = new TreeMap();

		Scanner input=new Scanner(System.in);
		String line;
		while ((line=input.nextLine()).length()>0){
			
			if(!tmap.containsKey(line))
			{
				tmap.put(line,1);
			}
			else
			{
				tmap.put(line, tmap.get(line) + 1);			}
	}

		for(String word:tmap.keySet()){
			int count= tmap.get(word);
			System.out.println(word+": "+ count);
		}

}
}