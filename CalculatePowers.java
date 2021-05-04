 import java.util.Scanner;

 public class CalculatePowers {
 	
 	public static void main (String [] args) 
 {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter your number");
     int mynumber = sc.nextInt();

     double square = Math.pow (mynumber, 2);
     double cube = Math.pow (mynumber, 3);
     double fourth = Math.pow (mynumber, 4);

     System.out.println("The square root of your number is " + square);
     System.out.println("The cube root of your number is " + cube);
     System.out.println("The fourth root of your number is " + fourth);

 }


 }
