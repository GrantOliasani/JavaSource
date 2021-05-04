import java.util.Scanner;
public class SummingValues{
	public static void main (String [] args){
		int evencount=0;
		int oddcount=0;
		int eveniterator=0;
		int odditerator= 0;
		int number=0;
		Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("Enter number. When finished enter -1");
        	number= sc.nextInt();
        if(number % 2==0){
        	evencount= evencount+number;
        	eveniterator++;
        }
		else{
			oddcount=oddcount+number;
			odditerator++;
		}

        } while (number != -1);
        int oddaverage= (oddcount+1)/(odditerator-1);
        System.out.println("The average of the even numbers is: " + (evencount/eveniterator));
        System.out.println("The average of the odd numbers is: " + (oddaverage));
	}
}