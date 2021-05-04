import java.util.Scanner;

 public class CalculateValues {
 	
 	public static void main (String [] args) 
 {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter your number");
     int mynumber = sc.nextInt();

     Scanner sc2 = new Scanner(System.in);

	 System.out.println("Enter your second number");
     int mynumber2 = sc2.nextInt();

     int sum = (mynumber + mynumber2);
     int difference = (mynumber - mynumber2);
     int product = (mynumber * mynumber2);
     double average = ((mynumber+ mynumber2) /2);
     double absolutevalueofdiff =  (Math.abs(mynumber - mynumber2));
     



     System.out.println("The sum of your numbers is " + sum);
     System.out.println("The difference of your numbers is " + difference);
     System.out.println("The product of your numbers is " + product);
     System.out.println("The average of your numbers is " + average);
     System.out.println("The absolute value of the difference of your numbers is " + absolutevalueofdiff);

	 System.out.println("The maximum value of your numbers is " + Math.max(mynumber, mynumber2));      
     System.out.println("The minimum value of your numbers is " + Math.min(mynumber, mynumber2)); 
 }


 }