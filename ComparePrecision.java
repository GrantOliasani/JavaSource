import java.util.Scanner;
import java.lang.Math;
public class ComparePrecision{
public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a floating point number");
double num1 = sc.nextDouble();
System.out.println("Enter another floating point number");
double num2 = sc.nextDouble();

 double intnum1= num1*100;
 double intnum2= num2*100;

if (intnum1==intnum2){
System.out.println("They are equal.");
}
else{
System.out.println("They are not equal.");
}
}
}