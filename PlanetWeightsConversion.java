import java.util.Scanner; //imports the java scanner utility
public class PlanetWeightsConversion{
	public static void main (String [] args){
		Scanner in= new Scanner(System.in); //initializes the scanner
		System.out.println("Enter your weight in pounds");
		double weight= in.nextInt(); //assigns the input to the variable weight
		double moonweight= (weight * (0.166));
		double mercuryweight= (weight * (0.4));
		double venusweight=(weight * (0.9));
		double jupiterweight=(weight * (2.5));
		double saturnweight=(weight * (1.1));
		System.out.println("Your weight on Moon would be: "+ moonweight);
		System.out.println("Your weight on Mercury would be: "+mercuryweight );
		System.out.println("Your weight on Venus would be: "+ venusweight);
		System.out.println("Your weight on Jupiter would be: "+jupiterweight );
		System.out.println("Your weight on Saturn would be: "+saturnweight );

	}


}