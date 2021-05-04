public class PrimeSequence implements Sequence
{
   private int lastvalueReported=1;											//Initializes instance variable lastValueReported to 1


   public static boolean isPrime(int x){									//Method to test if my "candidates" are prime
   	if(x==2){																// safeguard to return 2 as prime
   			return true;
   	}
 	
 	 for(int i=2;i<x;i++) {													//Loop that tests if prime
        	if(x%i==0){														
            	return false;												//after mod division, if the remainder is 0, not prime
         }

    }	
    			return true;												//if mod division returns a value greater than zero, prime

}

  
   public int next(){  
   	lastvalueReported++;													//increments lastValueReported by 1
   	while (PrimeSequence.isPrime(lastvalueReported)==false){				//while loop updating lastValueReported while the numbers are not prime.
   		lastvalueReported++;		
   	}

   	return lastvalueReported;												// when the while loop jumps out (when the number is prime) returns the lastValueReported
   }

}
