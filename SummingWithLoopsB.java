public class SummingWithLoopsB{
	public static void main (String [] args){
		int sum=0;
		int i=1;
		for(i=1; i<=100; i++){
			sum=sum+i*i;
		}
		System.out.println("The sum is "+ sum);
	}
}