import java.util.Scanner;

 public class FormattingOutput {
 	
 	public static void main (String [] args) 
 {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter your number");
      float mynumber = sc.nextInt();

      Scanner sc2 = new Scanner(System.in);

	 System.out.println("Enter your second number");
      float mynumber2 = sc2.nextInt();

      float sum = (mynumber + mynumber2);
      float difference = (mynumber - mynumber2);
      float product = (mynumber * mynumber2);
      float average = ((mynumber+ mynumber2) /2);
      float absolutevalueofdiff =  (Math.abs(mynumber - mynumber2));
     



      System.out.printf("The sum of your numbers is:                              %10.2f\n", sum);
      System.out.printf("The difference of your numbers is                        %10.2f\n", difference);
      System.out.printf("The product of your numbers is                           %10.2f\n", product);
      System.out.printf("The average of your numbers is                           %10.2f\n", average);
      System.out.printf("The absolute value of the difference of your numbers is  %10.2f\n", absolutevalueofdiff);

	 System.out.printf("The maximum value of your numbers is                     %10.2f\n" , Math.max(mynumber, mynumber2));      
      System.out.printf("The minimum value of your numbers is                     %10.2f\n" , Math.min(mynumber, mynumber2)); 
 }


 }