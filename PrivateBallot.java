import java.util.Scanner;
public class PrivateBallot{
	public static void main (String [] args){
		int brothers = 20;
		int numberyes=0;
		int numberno=0;

		for (int i=0; i<= brothers; i++){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter '1' to vote for suspension or '0' to vote for the forgiveness of Henson ");
		int vote= sc.nextInt();

		if(vote==1){
			numberyes++;

		}
		else if (vote==0){
			numberno++;
		}
		}


		System.out.println("The number of votes to suspend Hensonogloss: "+ numberyes);
		System.out.println("The number of votes to not suspend and forgive Hensonogloss: "+ numberno);

		if(numberyes>numberno){
			System.out.println("Henson, you are suspended. Turn in your number BIH");
		}
		if(numberyes==numberno){
			System.out.println("The vote is a tie. But you are still suspended");
		if(numberyes<numberno){
			System.out.println("Somehow by the grace of god your not suspended");
		}
		}


	}
}