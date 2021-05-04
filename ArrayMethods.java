import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
	// you will put numerical elements into the "values" array before
	// each test of your methods.  Your methods should operate on this array.
	// For each test you run, you should first print the values[] array before
	// the method call, and then after the method call.  (See sample output file).
	private int[] values;
	

	//constructor - give it an array of initial values and they will
	// be copied into the values instance variable
	
	public ArrayMethods(int[] initialValues) {
		values = Arrays.copyOf(initialValues, initialValues.length);
	}
	
	//a function to reset the array to the values passed in as a parameter
	//you will want to use this method after each test you do in the main
	//method
	public void setArray(int[] newValues) {
		values = Arrays.copyOf(newValues, newValues.length);
	}
	
	
	//part a, fill in this method
	public void swapFirstAndLast() {
		// save the first element to a temp var
		int temp = values[0];
		//move the last element to the first position
		values[0] = values[values.length-1];
		// now put the saved first element into the last position
		values[values.length-1] = temp;
		
	}
	
	//part b, fill in this method
	public void shiftRight() {
		int temp =values[values.length-1];
		for (int i = values.length-1; i > 0; i--)
		{
 			values[i] = values[i-1];
		}
		values[0]= temp;
	}
	
	//part c, set all even elements to 0.
	public void setEvensToZero() {
		
	for (int i = 0; i < values.length; i++) 
	{
	    if (values[i] %2 == 0) 
			{
				values[i]=0;
			}
    }
}
	//part d, replace each element except the first and last by larger of two 
	//around it
	public void largerOfAdjacents() {
		  int[] tempValues = new int[values.length];
        
        tempValues[0] = values[0];
        tempValues[tempValues.length - 1] = values[values.length - 1];
        
        for (int i = 1; i < values.length - 1; i++)
        {
            if (values[i - 1] > values[i + 1]){
                tempValues[i] = values[i - 1];
            }
            else{
                tempValues[i] = values[i + 1];
            }
        }
        
        for (int i = 0; i < values.length; i ++){
            values[i] = tempValues[i];
        }
    }
	
	//part e, remove middle el if odd length, else remove middle two els.
	public void removeMiddle() {  //set currentsize to values.length
		
		int pos= values.length/2;
		int [] tempArray= new int[currentsize];
		for (int i = 0; i < currentsize; i++){ 
			if(i<pos-1){
				tempArray[i]=values[i];
				currentsize--;
			}
			else if(i>pos+1){
				tempArray[i]=values[i];
				currentsize--;
			}
		System.out.println(Arrays.toString(tempArray));
	}
	}

	//part f - move all evens to front
	public void moveEvensToFront() {
		for ( int i=0; i< values.length-1; i++){
			if (values[i] %2 ==0 ) {
				values[i]= values[i+1];
			}
		}
}
	
	//part g - return second largest el in array
	public int ret2ndLargest() {
		Arrays.sort(values);
		return values.length-2;
		
		
 		
	}
	//part H - returns true if array is sorted in increasing order 
	public boolean isSorted() {
		//Arrays.sort(values);  //un comment if you wish to test for an ordered array.
	for (int i = 0; i < values.length-1; i++) {
		if(values[i] < values[i+1]){
			return true;
		}
		else if (values [i] > values[i+1]){
			return false;
		}
	}
return false;
    }
	//PART I - return true if array contains 2 adjacent duplicate values
	public boolean hasAdjDuplicates() {
		// set hasAdjDup equal to false as a starting reference 

	boolean hasAdjDup = false; 

for (int i =0; i < values.length -1; i++)
{

	if (values [i]== values[i+1])
	{
		hasAdjDup = true; 
	}
}
return hasAdjDup; //dummy return value
}
	
	//PART J - return true if array contains 2 duplicate values
	//duplicates need not be adjacent to return true
	
	public boolean hasDuplicates() {
		boolean hasDuplicates = false;
	for ( int i = 0; i < values.length; i++){
	for (int j = i + 1; j < values.length; j++){
	if (values[i]==values[j])
	{
	hasDuplicates =true;
	}
	else if (false){

	}
	}


	}
	 return hasDuplicates;//dummy return value

	}
	public static void main(String[] args) { 
		//In your main method you should test your array methods
		//First fill an array with random values
		Random myGen = new Random();
		final int TEST_SIZE = 10;
		//our initial random test data goes into the following array
		int[] testValues = new int[TEST_SIZE];
		for (int i=0; i<testValues.length; i++) {
			//fills the array with random ints between 1 and 50 inclusive
			testValues[i] = 1+myGen.nextInt(50);
		}
		//Now print the array to show initial values
		System.out.println("Initial Array:");
		//note the usage of the "toString()" method here to print the array
		System.out.println(Arrays.toString(testValues));
		//blank line
		System.out.println();
		
		//from here you should fill in code that tests parts a-j 
		//for problem E7.2 from the textbook
		//part a is done for you below.  You should follow this format
		//to test each of your methods.
		//create a new ArrayMethods object.
		ArrayMethods myMethods = new ArrayMethods(testValues);
		
		//Test methods below this line.
		//Test of swapFirstAndLast()
		System.out.println("Before call to swapFirstAndLast()");
		System.out.println(Arrays.toString(myMethods.values));
		//swap first and last element
		myMethods.swapFirstAndLast();
		System.out.println("After call to swapFirstAndLast()");
		System.out.println(Arrays.toString(myMethods.values));
		System.out.println();
		//reset the Array to the initial test values
		myMethods.setArray(testValues);
		//Test of shiftRight()
		System.out.println("Before call to shiftRight()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.shiftRight();
		System.out.println("After call to shiftRight()");
		System.out.println(Arrays.toString(myMethods.values));
		
		myMethods.setArray(testValues);
		//Test of setEvenstoZero()
		System.out.println("Before call to setEvensToZero()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.setEvensToZero();
		System.out.println("After call to setEvensToZero()");
		System.out.println(Arrays.toString(myMethods.values));
		
		myMethods.setArray(testValues);
		//Test of AdjacentValues()
		System.out.println("Before call to AdjacentValues()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.largerOfAdjacents();
		System.out.println("After call to AdjacentValues()"); 
		System.out.println(Arrays.toString(myMethods.values));
		 
		myMethods.setArray(testValues);
		//Test of RemoveMiddleElement()
		System.out.println("Before call to removeMiddle()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.removeMiddle();
		System.out.println("After call to removeMiddle()"); 
		System.out.println(Arrays.toString(myMethods.values));

		myMethods.setArray(testValues);
		//Test of moveEvensToFront()
		System.out.println("Before call to moveEvensToFront()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.moveEvensToFront();
		System.out.println("After call to moveEvensToFront()"); 
		System.out.println(Arrays.toString(myMethods.values));

		myMethods.setArray(testValues);
		//Test of ret2ndLargest()
		System.out.println("Before call to ret2ndLargest()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.ret2ndLargest();
		System.out.println("After call to ret2ndLargest()"); 
		System.out.println(Arrays.toString(myMethods.values));





		myMethods.setArray(testValues);
		//Test of isSorted
		System.out.println("Before call to isSorted()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.isSorted();
		System.out.println("After call to isSorted()");
		System.out.println(Arrays.toString(myMethods.values));
		if (myMethods.isSorted()==false){
			System.out.println("The array is not sorted");
		}
		else if (myMethods.isSorted()==true){
			System.out.println("The array is sorted");
		}

		myMethods.setArray(testValues);
		//Test of hasAdjDuplicates()
		System.out.println("Before call to hasAdjDuplicates()");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.hasAdjDuplicates();
		System.out.println("After call to hasAdjDuplicates()"); 
		if (myMethods.hasAdjDuplicates()== true){
			System.out.println("There are adjacent duplicates in the array");
		}
		else if(myMethods.hasAdjDuplicates()== false){
			System.out.println("There are no adjacent duplicates in the array");
		}

		myMethods.setArray(testValues);
		//Test of hasDuplicates()
		System.out.println("Before call to hasDuplicates())");
		System.out.println(Arrays.toString(myMethods.values));
		myMethods.hasDuplicates();
		System.out.println("After call to hasDuplicates()");
		if (myMethods.hasDuplicates()==true) {
			System.out.println("Array has duplicates");
		}
		else if (myMethods.hasDuplicates()==false){
			System.out.println("Array has no duplicates");
		}
		 
		
		 
	}

}


//REMOVE MIDDLE element 
//if (evenlength) {  ....} else {} odd case
	

//I couldnt get return second largest to work to save my life.
//I couldnt get remove the middle element to work to save my life.
//Its not my greatest work but I tried...


