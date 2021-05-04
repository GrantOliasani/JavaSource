public class SummingWithLoopsA{
	public static void main (String [] args){
		int sum=0;
		int i=2;
		for(i=2; i<=100; i+=2){
			sum=sum+i;
		}
		System.out.println("The sum is "+ sum);
	}
}