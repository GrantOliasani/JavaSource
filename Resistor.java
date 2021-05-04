public class Resistor extends Circuit
   {
   	private double resistance;					//Instance variable to hold the resistance value
     public Resistor(double resistance){		//Constructs Resistor so the values in CircuitDemo get inputed into Resistor()
     	this.resistance=resistance;
     }
     public double getResistance(){				//Method to get resistance
     return resistance;							//returns computed Resistance Value

 	}
   }