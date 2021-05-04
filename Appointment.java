public class Appointment{
private int year;
private int month;
private int day;
private String description;

public Appointment(int year,int month,int day,int description){
	this.year=year;
	this.month=month;
	this.day=day;
	this.description=description;
}

public int getYear(){
	return year;
}
public int getMonth(){
	return month;
}
public int getDay(){
	return day;
}

public boolean occursOn (int year, int month, int day){
	this.year=year;
	this.month=month;
	this.day=day;

	if ( year==getYear() && month==getMonth() && day==getDay()){
		return true;

	}
	return false;
}

	public String tostring(){
		return description;	
	}
}









//getYear, getMonth, getDay, and getDescription	




//tostring method	
