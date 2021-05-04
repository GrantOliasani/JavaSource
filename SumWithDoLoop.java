public class SumWithDoLoop{
	public static void main (String []args){
		int sum=0;
		int count=10;
		do{	
			sum= sum + count;
			count++;


		}while (count <=20);
		System.out.println(sum);
	}
}