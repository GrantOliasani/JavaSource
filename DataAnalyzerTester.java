import java.io.File;
import java.util.Scanner;
public class DataAnalyzerTester{
	public static void main (String []args){
		DataAnalyzer analyze = new DataAnalyzer("data.txt");

            System.out.println(analyze.min());
            System.out.println(analyze.max());
            System.out.println(analyze.avg());
	
	}
}