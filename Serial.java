	import java.util.ArrayList;
   public class Serial extends Circuit
   {
      private ArrayList<Circuit> listValues=new ArrayList<Circuit>();		//Creates new arrayList from Circuit

      public void add(Circuit circuit1){									//Adds the values to listValues from circuit 1, defined in Circuit Demo
            listValues.add(circuit1);
        }
 	public double getResistance(){											//Method to getResistance() which overrides the previous getResistance

 		double sum=0;														//Math to compute sum(resistance)
 		for(int i=0; i<listValues.size(); i++){
 			sum+=listValues.get(i).getResistance();
 		}
 		return sum;															//returns sum to getResistance()
 	}
 }