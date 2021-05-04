import java.util.ArrayList;
public class Parallel extends Circuit
   {

     private ArrayList<Circuit> listValues=new ArrayList<Circuit>(); 				//Creates new arrayList from Circuit
     public void add(Circuit circuit2){
     	listValues.add(circuit2);													//Adds the values to listValues from circuit 2, defined in Circuit Demo
     }

     public double getResistance(){													//Method to getResistance() which overrides the previous getResistance
     	double sum=0;
     	for (int i=0; i<listValues.size(); i++){									//Math to compute sum(resistance)

           sum+= (1/listValues.get(i).getResistance());
       }
            return 1/sum;															//returns sum to getResistance()

       }
      
   }
