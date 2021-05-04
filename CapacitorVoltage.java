import java.util.Scanner;											//Import all necessary utilities
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.Math;
public class CapacitorVoltage{
	public static void main (String [] args){
	
	try																//Handles Catch and throw exception
	{
	PrintWriter rc= new PrintWriter("rc.txt");						//Constructs a new PrintWriter file to write the output to
	File inputFile = new File ("params.txt");						//Contructs a new file that holds the inputs the values
	Scanner in = new Scanner(inputFile);							//Creates a new Scanner object that gets the input values from the inputfile
	double b= in.nextDouble();										//Assigns the first value to b
	double r= in.nextDouble();										//Assigns the second value to r
	double c= in.nextDouble();										//Assigns the third value to c
	double startingTime= in.nextDouble();							//Assigns the fourth value to startingTime
	double endingTime= in.nextDouble();								//Assigns the fith value to endingTime
	double voltage=0;												//initializes the variable voltage

	while (startingTime <= 1000)									//while loop to end the list once startingTime reaches 1000
	{

		voltage= b*(1- Math.exp((-startingTime)/(r*c)));			//formula for voltage
		rc.printf("%10.2f%12.5f\n", startingTime, voltage);			//writes the ouput to rc.txt file
		startingTime=startingTime+10;								//increments the startingTime value
	}

      
         in.close();												//once the loop finishes, closes the files
         rc.close();
  }
    catch(FileNotFoundException exception){							//handles the event that the file was not found
    	System.out.println("System can not find file.");
    }
}
}