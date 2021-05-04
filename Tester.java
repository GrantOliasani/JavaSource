import java.util.Random;
public class Tester{
	public static void main (String []args){
		int NUM_VEHICLES= 10;

		Vehicle[] vehicleArray= new Vehicle[NUM_VEHICLES];
		Random randomNumber= new Random();
		
		for(int i=0; i<10; i++){
		int randomNum= randomNumber.nextInt(3);
		double effeciencyrandomNum= (randomNumber.nextDouble())*100;
			if (randomNum==0){
			vehicleArray[i]= new Vehicle(effeciencyrandomNum);
			}
		else if(randomNum== 1){
			vehicleArray[i]=new Car(effeciencyrandomNum);
			}
		else if (randomNum==2){
			vehicleArray[i]= new Boat(effeciencyrandomNum);
			}	

		vehicleArray[i].printMessage();
	}
	   for(int j=0; j<10; j++){
		
		System.out.printf("%-15s%-8.4f\n", vehicleArray[j].getName()+":",vehicleArray[j].getEfficiency());

			}

		Vehicle thresholdVehicle= (Vehicle)getFirstBelowT(vehicleArray,20);
		if (thresholdVehicle==null){
			System.out.println("No vehicle had a value below the treshold value.");

		}
		else{
			System.out.printf("The first object with efficiency less than "+ 20 + " was " + thresholdVehicle.getName()+ " with efficiency of " + thresholdVehicle.getEfficiency());
		}
	}
	public static Efficiency getFirstBelowT(Efficiency[] vehicleArray, double thresholdValue){
			vehicleArray=vehicleArray;
			double tValue=thresholdValue;
			for(int i=0;i<10;i++){
				if (vehicleArray[i].getEfficiency()<tValue){
					return vehicleArray[i];
				}
			}
			return null;
		}



}