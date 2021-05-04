//imports the scanner
import java.util.Scanner;
public class CorrectChange
{
	public static void main (String [] args)
	{
		//Allows user to input the amount of change
		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter the amount of change :");
		     int amountofchange = sc.nextInt();
		     
		//Assigns values to Q,D,N,P
		int Quarters= amountofchange / 25;
			 amountofchange = (amountofchange - (Quarters *25));
		int Dimes= amountofchange / 10;
			 amountofchange = (amountofchange - (Dimes *10));
		int Nickels= amountofchange / 5;
			 amountofchange = (amountofchange - (Nickels *5));
		int Pennies= amountofchange;
			
		System.out.println("The number of pennies is " + Pennies);
		System.out.println("The number of nickels is " + Nickels);
		System.out.println("The number of dimes is " + Dimes);
		System.out.println("The number of quarters is " + Quarters);









	}


}