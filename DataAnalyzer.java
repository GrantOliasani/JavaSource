import java.util.Scanner;
import java.io.File;
import java.lang.Math;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class DataAnalyzer
{   
	private FileReader reader;
    private ArrayList<String> fileContent = new ArrayList<String>();

    public DataAnalyzer(String fileN)
    {
        try
        {
            reader = new FileReader(fileN);
            Scanner in = new Scanner(reader);
            while(in.hasNextLine())
            {
                fileContent.add(in.nextLine());
            }
           Collections.sort(fileContent);

        }
        catch(FileNotFoundException exception)
        {
            System.out.println("File not found. ");
        }
    }


    public  String min()
    {
    	   return "The minimum value of the data set is: " +fileContent.get(1);

    }

    public String max()
    {

        return "The maximum value of the data set is: " +fileContent.get(0);
    }

    public String avg()
    {
        return "The average value of the data set is: " +fileContent.get(3);
    }

   
}