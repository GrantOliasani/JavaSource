public class Vehicle implements Efficiency
{
	private double efficiency;
//Consstructor here
	public Vehicle(double efficiency){
		this.efficiency=efficiency;
	}
	public double getEfficiency(){
		return efficiency;
	}

	public void printMessage(){
		System.out.println("I am a Vehicle! VROOM!!!");
	}
	public String getName(){
		return getClass().getName();
	}
}