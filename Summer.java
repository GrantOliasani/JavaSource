public class Summer{
	
	public Summer(int upperlimit){
		locallimit=upperlimit;
	}
	public int sumTotal(){

		for(int i=1; i<=locallimit; i++){
			total=total+i;
		}
		return total;
	}
	public int secondsumTotal(){

		for(int i=100; i<=locallimit; i++){
			total=total+i;
		}
		return total;
	}
	private int locallimit;
	private int total=0;
}
