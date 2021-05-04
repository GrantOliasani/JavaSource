import java.util.ArrayList;
public class Calendar{
private ArrayList<Integer> listCal;

/**
* A method to add an appointment to the calendar
* /@param apt – the appointment object to add to the calendar.
*/
public void add(Appointment apt) {
		
}
/**
* A method to remove an appointment from the calendar.
* This method uses the occursOn() method from the public
* interface for the Appointment class. Therefore, if parameters
* are entered that occur after a start date for a given Daily 
* appointment
* the Daily appointment will be removed as well. (Because occursOn() 
* willreturn true in this case). This is a limitation we will
* accept for now.
**/
public void remove(int year, int month, int day) {
//this method needs to iterate over your list of appointments
//and remove elements who's occursOn() method return true
//when passed the parameters above.
}
public String toString() {
String ret = "";
//this method needs to iterate over your list of appointments
//and construct the return string
//make sure to put each appointment on its own line
//by using “\n”
return ret;
}



}