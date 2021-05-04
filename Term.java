public class Term{
	private double coeffecient;
	private int power;

	public Term(double coeffecient, int power){			//Term constructor that accepts a coeffecient and power
	this.coeffecient= coeffecient;
	this.power= power;
	}

	public double getCoeffecient(){		//returns coeffecient
		return coeffecient;
	}	
	public int getPower(){				//returns power
		return power;
	}
	public Term multiply(Term t){ 		//method to multiply the two terms
		return new Term(coeffecient*t.coeffecient, power+t.power);//return a new term
	}
	public void addIfSamePower(Term t){		//method to add if the powers match
		if(power==t.power){					//tests if the powers are the same
			coeffecient=coeffecient+t.coeffecient;
			power= power;
		}
	}
	public String toString(){				//toString method
		return coeffecient + "x^"+ power;
	}
	
	//to string method to add x and what not. return a string 
	//Use TERM not t

}