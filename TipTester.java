import java.util.Scanner;
public class TipTester{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the cost of the meal: ");
double bill= sc.nextDouble();
System.out.println("Input a satisfaciton rating of 1 for totally satisfied, 2 for satisfied, 3 for dissatisfied: ");
int satisfactionRating= sc.nextInt();

Tip in= new Tip(satisfactionRating);
double tipamt=in.calculateTip(bill);

double totalMeal= bill + tipamt;

if (satisfactionRating == 1){

	 System.out.println("Satisfaction level: Very Satisfied");
	 System.out.println("Cost of meal: " + bill);
	 System.out.println("Cost of tip: " + tipamt);
	 System.out.println("Cost of entire meal "+ totalMeal);
}
 if(satisfactionRating == 2){

	System.out.println("Satisfaction level: Satisfied");
	 System.out.println("Cost of meal: " + bill);
	 System.out.println("Cost of tip: " + tipamt);
	 System.out.println("Cost of entire meal "+ totalMeal);
}
else{

	 System.out.println("Satisfaction level: Dissatisfied");
	 System.out.println("Cost of meal: " + bill);
	 System.out.println("Cost of tip: " + tipamt);
	 System.out.println("Cost of entire meal "+ totalMeal);
}
}

}