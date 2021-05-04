/**
   A class to simulate a combination lock.
*/
public class ComboLock
{
   
   //********* you will need to create appropriate instance variables here
   private final int secret1; //Instance variable to hold secret1
   private final int secret2; //Instance variable to hold secret2
   private final int secret3;  //Instance variable to hold secret3
   // current position

   private int currentNumber = 0; //holds the current number

   private int currentState = 0; //holds the current state

   /**
      Initializes the combination of the lock.
      
   */
   //**** COMPLETE THIS CONSTRUCTOR - input should be 3 number combination
   //**** You may need to set other instance variables other than the 
   //**** arguments here
   //You should verify that the secret number are in the range 0-39 (inclusive)
   //if the values given are not in that range, clamp them.
   //i.e. the call new ComboLock(0, -20, 45) would create a combination of
   // 0, 0, 39  (the -20 gets clamped to 0 because it was less than 0)
   // (the 45 gets clamped to 39 because it was > 39).
   public ComboLock(int secret1, int secret2, int secret3)
   {
      this.secret1 = secret1; //initializes secret 1, 2, and 3.
      this.secret2 = secret2;
      this.secret3 = secret3;

//fill in
   }
   /**
      Resets the state of the lock so that it can be opened again.
   */
   //********* COMPLETE THIS METHOD
   public void reset()
   {
    
    currentState=0;  //Reset method

   }

   /**
      Turns lock left given number of ticks.
      @param ticks number of ticks to turn left
   */
   //*********COMPLETE THIS METHOD
   //you can assume that ticks will be a valid value between 0-40 
   //note that 40 ticks in either direction should return us back to the 
   //number we started on
   public void turnLeft(int ticks)
   {
      if (currentNumber + ticks < 40) 
      {                                             //If the current number plus the entered amount of ticks is less than forty, perform the function.
          currentNumber = (currentNumber + ticks);
      }

      if (currentState == 1 && currentNumber == secret2)  //checks current State and updates it
      {                 
          currentState=2;
          return;
      }

  

   }


   

   /**
      Turns lock right given number of ticks
      @param ticks number of ticks to turn right
   */
   //*********COMPLETE THIS METHOD
   //you can assume that ticks will be a valid value between 0-40 
   //note that 40 ticks in either direction should return us back to the 
   //number we started on
   public void turnRight(int ticks)
   {
       
  if( currentState==3)              // Checks to see if it is the second time turning right, if it is- perform function
  {
   currentNumber = 40-ticks;
  }

  else if (currentNumber - ticks > 0) //checks if dial position is greater than zero, if it is- perform function
  {
   currentNumber = currentNumber - ticks;
  }
  else {
   currentNumber = (40 - (ticks - currentNumber));    //else, it takes ticks minus currentNumber and subtracts 40.
  }
  


  if(currentState == 0 && currentNumber == secret1) {  //Checks state


  currentState++;                                     //Updates state

  return;

  }

  if(currentState == 2 && currentNumber == secret3) {


  currentState++;

  return;                                                   //Returns State

  }


  else reset();                 //If something went wrong, it resets to zeros.

   }

   /**
      Returns true if the lock can be opened now
      @return true if lock is in open state
   */
   //**** COMPLETE THIS METHOD
   public boolean open()
   {
      return currentState==3;      //If its open, currentState equals 3

   }
   /**
   Returns current value dial is pointing at
   @return value dial is pointing at currently
    */
   public int getCurrentNumber() {
      return currentNumber;                   //returns number
   }
   
}