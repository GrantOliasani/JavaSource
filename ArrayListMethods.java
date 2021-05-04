import java.util.Collections; //need this one for sorting ArrayList
import java.util.Random;
import java.util.ArrayList;

public class ArrayListMethods {
	
	//ArrayList to hold values to work on for lab
	private ArrayList<Integer> listValues;

	//ArrayList constructor
	public ArrayListMethods(ArrayList<Integer> initialValues) {
		//note this shows how to make a copy of an array list
		//simply pass the old list in as an argument to 
		//the ArrayList constructor
		listValues = new ArrayList<Integer>(initialValues);
	}
	
	//set listValues to list passed as parm
	//use this method to "reset" our ArrayList data before each test
	public void setArrayList(ArrayList<Integer> newValues) {
		listValues = new ArrayList<Integer>(newValues);
	}
	
	//method to print the current values in the ArrayList
	//or you can simply use println() with the array list as the
	//parameter
	public void printArrayList() {
		System.out.println(listValues);
	}
	
	//part a, done for you.
	public void swapFirstAndLast() {
		//save first element
		int temp = listValues.get(0);
		//move last element to first position (0)
		listValues.set(0,  listValues.get(listValues.size()-1));
		//put temp value into last position (size() -1)
		listValues.set(listValues.size()-1, temp);
	}
	
	
	//part b, fill in this method //*****************************************HELP************
	public void shiftRight() {
		listValues.add(0, listValues.get(listValues.size()-1)); //Accesses the last element in the array list and moves it to the front

		listValues.remove(listValues.size()-1);	//removes the last element in the arraylist							 


	}
	
	//part c, set all even elements to 0.
	public void setEvensToZero() {
	for (int i= 0; i< listValues.size(); i++){	//loops over the entire array
		if ((listValues.get(i) % 2) == 0 ){		//Tests if the element is even
		listValues.set(i , 0);					//if even, sets the element at I to zero

		}
	}	

}
		//part d, replace each element except the first and last by larger of two 
		//around it
	public void largerOfAdjacents() {
		ArrayList<Integer> tempArrayList = new ArrayList<Integer>(listValues);		//constructs a temporary array list
		tempArrayList.set(0,  listValues.get(0));									//sets tempArrayList index 0 to the same index 0 of listValues.
		tempArrayList.set(tempArrayList.size()-1, listValues.get(listValues.size()-1));//sets the last element of arraylist to the same respective element in listValues.

		for (int i= 1; i< listValues.size()-1; i++){ //loops over the array starting at index 1 and ending at the second to last.
		if ((listValues.get(i-1) > listValues.get(i+1))) { //Tests if the elements on either side of element i are greater than element i
		tempArrayList.set(i, listValues.get(i-1));			//if either side is greater, it sets the larger one to element i
		}
		else{
		tempArrayList.set(i, listValues.get(i+1));		
		}
	}	

		for (int i= 0; i< listValues.size(); i++){			//loops over the array
			listValues=tempArrayList;						//sets list values equal to the temporary array
		}

}
	
	//part e, remove middle el if odd length, else remove middle two els.
	public void removeMiddle() {
			if(listValues.size()%2==0){						// Tests if the size of the array is even
				listValues.remove(listValues.size()/2);		//if even, it removes the element at size()/2
				listValues.remove((listValues.size()/2));	//divides again to remove the second middle element.

			}
			else if( listValues.size()%2!=0){				// if the size is odd, removes the exact middle element.
				listValues.remove(listValues.size()/2);
			}
	}
	
	//part f - move all evens to front //*********
	public void moveEvensToFront() {   
		ArrayList<Integer> tempArrayList2 = new ArrayList<Integer>(); //Creates a temporary array list called tempArrayList2
		for(int i=0; i<listValues.size(); i++){							//loops over the entire array
			if (listValues.get(i)%2==0){								// tests if the element at i is even
				tempArrayList2.add(listValues.get(i));					//adds the evens to the beginning of the temp Array
			
			}
		}
		for (int i=0; i<listValues.size(); i++){						//second loop over the array
			if (listValues.get(i)%2!=0){								//tests if they are odd
				tempArrayList2.add(listValues.get(i));					//adds the odds to the temp array list
	}
}
		listValues=tempArrayList2;										//sets the original array equal to the temp array
}
	
	//part g - return second largest el in array
	public int ret2ndLargest() {
		Collections.sort(listValues);									// Sorts the listValues array
		int secondLargest= listValues.get(listValues.size()-2);			// stores the second largest element in the variable secondLargest



		return secondLargest; //dummy 									// Returns the value secondLargest
	}
	
	//part H - returns true if array is sorted in increasing order 
	public boolean isSorted() {
		//Collections.sort(listValues);  //----If you wish to test for a sorted array, UNcomment.

		boolean isSorted = false; //initially assume list is not sorted
		for (int i= 0; i< listValues.size()-1; i++){					//loops over the array
		if ((listValues.get(i) < listValues.get(i+1))) {				//tests if the element i is less than the element at i+1
		isSorted=true;													// if it completes the entire array, it is sorted
		}
	    }
		for (int i= 0; i< listValues.size()-1; i++){					//loops over the array
		if ((listValues.get(i) > listValues.get(i+1))) {				//tests if the element i is less than the element at i+1
		isSorted=false;													//if the test fails, isSorted=false
		}
		}
		return isSorted; //dummy 										//returns the value of isSorted
	
	
}
	//PART I - return true if array contains 2 adjacent duplicate values
	public boolean hasAdjDuplicates() {
		boolean hasDup = false; //assume no duplicates, then search array
		for (int i= 0; i< listValues.size()-1; i++){					// iterates over the array except last element
			if (listValues.get(i)==listValues.get(i+1)){				//tests if the value of i is equal to the element next to it
				hasDup=true;
			}
			else if (false){											
				hasDup=false;
			}
		}
		return hasDup;
	}
	
	
	//PART J - return true if array contains 2 duplicate values
	//duplicates need not be adjacent to return true
	public boolean hasDuplicates() {
		boolean hasDup = false; //assume no duplicates, then search array
		for (int i= 0; i< listValues.size(); i++){						//loops over the entire array
			for (int j= i+1; j< listValues.size(); j++){				//second loop to test for duplicates
				if((listValues.get(i)==listValues.get(j))) {			//tests if i and j are equal
					hasDup=true;
				}
				else if (false){

				}

		}
		}
		return hasDup;
	}
	
	public static void main(String[] args) {
		//In your main method you should test your array methods
		//First fill an array with random values
		Random myGen = new Random();
		final int TEST_SIZE = 10;
		//our initial random test data goes into the following array list
		//don't make changes to this array, it will hold your test data
		ArrayList<Integer> listTestValues = new ArrayList<Integer>();
		//fill in test arrayList
		for (int i=0; i<TEST_SIZE; i++) {
			//fills the array List with random ints between 1 and 50 inclusive
			listTestValues.add(1+myGen.nextInt(50));
		}
		
		//Now print the array list to show initial values
		System.out.println("Initial Array List:");
		//you can use the following line to print the list
		System.out.println(listTestValues);
		System.out.println();
		
		//from here you should fill in code that tests parts a-j 
		//for problem E7.2 from the textbook
		//part a is done for you below.  You should follow this format
		//to test each of your methods.
		//create a new ArrayListMethods object.
		//note the following line will also initialize our arraylist data
		ArrayListMethods myMethods = new ArrayListMethods(listTestValues);
		
		//Test methods below this line.
		//Test of swapFirstAndLast()
		System.out.println("Before call to swapFirstAndLast():");
		System.out.println(myMethods.listValues);
		//swap first and last element
		myMethods.swapFirstAndLast();
		System.out.println("After call to swapFirstAndLast():");
		System.out.println(myMethods.listValues);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);
		
		//***Begin second test below this line
		System.out.println("Before call to shiftRight():");
		System.out.println(myMethods.listValues);
		//shift all elements to the right
		myMethods.shiftRight();
		System.out.println("After call to shiftRight():");
		System.out.println(myMethods.listValues);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);

		System.out.println("Before call to setEvensToZero():");
		System.out.println(myMethods.listValues);
		//set all evens to zero
		myMethods.setEvensToZero();
		System.out.println("After call to setEvensToZero():");
		System.out.println(myMethods.listValues);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);

		System.out.println("Before call to largerOfAdjacents():");
		System.out.println(myMethods.listValues);
		//swaps middle element with the larger of the two adjacent values
		myMethods.largerOfAdjacents();
		System.out.println("After call to largerOfAdjacents():");
		System.out.println(myMethods.listValues);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);

		System.out.println("Before call to removeMiddle():");
		System.out.println(myMethods.listValues);
		//removes the middle of the array
		myMethods.removeMiddle();
		System.out.println("After call to removeMiddle():");
		System.out.println(myMethods.listValues);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);

		myMethods.listValues.remove(0);
		System.out.println("Odd Case.");
		System.out.println("Before call to removeMiddle():");
		System.out.println(myMethods.listValues);
		//removes the middle of the array (odd case)
		myMethods.removeMiddle();
		System.out.println("After call to removeMiddle():");
		System.out.println(myMethods.listValues);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);

		System.out.println("Before call to moveEvensToFront():");
		System.out.println(myMethods.listValues);
		//moves the evens to the front
		myMethods.moveEvensToFront();
		System.out.println("After call to moveEvensToFront():");
		System.out.println(myMethods.listValues);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);


		System.out.println("Before call to ret2ndLargest():");
		System.out.println(myMethods.listValues);
		//return second largest
		int temp=myMethods.ret2ndLargest();
		System.out.println("After call to ret2ndLargest():");
		System.out.println(temp);
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);



		System.out.println("Before call to isSorted():");
		System.out.println(myMethods.listValues);
		//tells you if the array is sorted or not 
		myMethods.isSorted();
		System.out.println("After call to isSorted():");
		System.out.println(myMethods.listValues);
		//Tests to see if isSorted is true or not
		if(myMethods.isSorted()==true){
			System.out.println("The array is sorted");
		}
		else if (myMethods.isSorted()==false){
			System.out.println("The array is not sorted");
		}
		
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);


		System.out.println("Before call to hasAdjDuplicates():");
		System.out.println(myMethods.listValues);
		//tests to see if there are two equal values next to each other 
		myMethods.hasAdjDuplicates();
		System.out.println("After call to hasAdjDuplicates():");
		if(myMethods.hasAdjDuplicates()==true){
			System.out.println("There are adjacent duplicates");
		}
		else if(myMethods.hasAdjDuplicates()==false){
			System.out.println("There are no adjacent duplicates");
		}
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);


		System.out.println("Before call to hasDuplicates():");
		System.out.println(myMethods.listValues);
		//tests to see if there are any of the same values in the array.
		myMethods.hasDuplicates();
		System.out.println("After call to hasDuplicates():");
		if(myMethods.hasDuplicates()==true){
			System.out.println("There are duplicates");
		}
		else if(myMethods.hasDuplicates()==false){
			System.out.println("There are no duplicates");
		}
		System.out.println();
		//reset the Array List to the initial test values
		myMethods.setArrayList(listTestValues);
	}
}