public class Tip{
//instance fields
private int satisfactionRating;
//Constructor
public Tip (int sRating){
	satisfactionRating=sRating;
}
//Methods
public double calculateTip(double bill){
double tip=0.0;	
if (satisfactionRating == 1){

	 tip= bill * 0.20;
}
 if(satisfactionRating == 2){

	 tip= bill * 0.15;
}
else{

	 tip= bill * 0.10;
}
return tip;
}

	
}