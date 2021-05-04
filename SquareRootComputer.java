import java.util.Scanner;

/**
 * Greek's method to approximate the square root of a given number.
 */
public class SquareRootComputer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);					//Creates a scanner object, sc							
		System.out.println("Enter a value: ");					//Prompts user for input
		double x= sc.nextInt();									//assigns the input to x
		System.out.printf("The square root of "+x +" is : " + "%.5f\n", squareRoot(x) );   //Prints out the approximated square root of x with a call to the square root recursive method
		System.out.printf("Expected value: "+ "%.5f\n", Math.sqrt(x) ); //Prints out the expected square root vale
	}

	public static double squareRoot(double x) {
		
		double g= x/2;									//assigns x/2 to our first guess

		return squareRootGuess(x,g);					//returns a call to the SquareRootGuess method
	}

	private static double squareRootGuess(double x, double g) {
		
		double betterguess=((g + x/g)/2);				//assigns betterguess to the greek formula for square root
		if (Math.abs((g*g)-x)<0.0001){return g;} //once the square root gets within .0001 of the value, return g
		else{ 

		return squareRootGuess(x,betterguess);			//recursive method call, moving towards base case
	}
}
}