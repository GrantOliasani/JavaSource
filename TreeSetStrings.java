//Grant Oliasani
//DDQ517
//Algorithms
import java.util.TreeSet;
import java.util.Comparator;


public class TreeSetStrings{
	public static void main(String[]args){
		TreeSet<String> myTreeSet= new TreeSet<String>(new myComparator());
		myTreeSet.add("hi");
		myTreeSet.add("hello");
		myTreeSet.add("abe");
		myTreeSet.add("baahhhhhhhhhhh");
		myTreeSet.add("cats");
		myTreeSet.add("c");
		myTreeSet.add("c1");
		myTreeSet.add("c2");
		for(String s: myTreeSet){
			System.out.println(s);
		}
	}
}

class myComparator implements Comparator<String>{
	public int compare(String str1, String str2){
		if(str1.length()==str2.length()){
		return str1.compareTo(str2)*-1;
	}
	if(str1.length()<str2.length()){
		return -1;
	}
	if(str1.length()>str2.length()){
		return 1;
	}
	return 1;
 }
}