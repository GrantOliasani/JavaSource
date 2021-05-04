public class salesTax {
        public salesTax (double stateTax,double countyTax)
    {
      // instance fields
      private double stateTax;
      private double countyTax;
      private double initialPrice;
      private double totalTax;
      private double totalCost;
    }
      //Counstructors
      /*Constructor name always same name as class. Always public.*/
      public SalesTax(double sRate, double cRate)
    {  
       stateTax= sRate;
       countyTax=cRate;
    }
    //Methods
    //Always name methods a verb "Calculate"
    
    public void CalculateTax( double iPrice){
       initialPrice= iPrice; 
       double totalTax= ((initialPrice*countyTax) + (initialPrice* stateTax));

    }   
    // method to calculate the total cost
    public void calculateTotalCost( )
    {
       double totalCost= (totalTax + initialPrice);
    }
    // get total tax amount
     public double getTax()
     {
         return totalTax;
      }
     // get total purchase with tax 
     public double getCost()
     {
         return totalCost;
        }
 
        
    
 
}