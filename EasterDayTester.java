import java.util.Scanner;
public class EasterDayTester{
public static void main (String [] args){
Scanner sc= new Scanner(System.in); //initializes the scanner
		System.out.println("Enter the year: ");
		EasterDay in = EasterDay(sc.nextInt()); //assigns the input to the variable input
		System.out.println("The month of easter is: "+ in.getEasterSundayMonth());
		System.out.println("The day of easter is: " + in.getEasterSundayDay());




}

}
