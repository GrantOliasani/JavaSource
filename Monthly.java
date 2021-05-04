public class Monthly extends Appointment{	
	private int day;
	private int month;
	private int year;
	private String description;

	public Monthly(int year,int month,int day, String description)
{
	this.day=day;
	this.month=month;
	this.year=year;
	this.description=description;
}
	public boolean occurson(int year, int month, int day){
 
 if (year < getYear()){
 return false;
 }
 if (month < getMonth() && year == getYear()){
 return false;
 }
 return day == getDay();
 }

}

