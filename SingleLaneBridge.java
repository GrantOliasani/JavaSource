

	import java.util.concurrent.Semaphore;
	import java.util.concurrent.TimeUnit;
	 
	class Bridge
	{
	    private final Semaphore semaphore;
	     
	    public Bridge()
	    {
	        semaphore = new Semaphore(1);
	    }
	    public void crossBridge(Vehicle vehicle)
	    {
	        try
	        {
	            //tells which car is trying to cross the bridge
	        	System.out.printf("Car %s is trying to cross the bridge.\n",vehicle.getCarName());
	            semaphore.acquire();
	            //tells which car is actually crossing the bridge
	            System.out.printf("Car %s is crossing the bridge.\n",vehicle.getCarName());
	            //random time for thread to sleep to simulate a car crossing a bridge
	            long travelTime = (long)(Math.random() * 15);
	            TimeUnit.SECONDS.sleep(travelTime);
	        }
	        catch(InterruptedException iex)
	        {
	            iex.printStackTrace();
	        }
	        finally
	        {
	            //tells when a car has actually crossed the bridge and the thread is released
	        	System.out.printf("Car %s has crossed the bridge.\n",vehicle.getCarName());
	            semaphore.release();
	        }
	    }
	}
	 
	class Vehicle implements Runnable
	{
	    //instance variables
		private String name;
	    private Bridge bridge;
	     
	    public Vehicle(Bridge bridge)//constructor for making a bridge
	    {
	        this.bridge = bridge;
	    }
	     
	    public void run()//method called to make the threads move
	    {
	        bridge.crossBridge(this);
	    }
	 
	    public String getCarName() //method returns the name of the thread
	    {
	        return name;
	    }
	 
	    public void setCarName(String name)//method that sets a certain name to a thread 
	    {
	        this.name = name;
	    }
	 
	}
	public class SingleLaneBridge 
	{
	 
	    public static void main(String[] args)
	    {
	       //creates a new bridge
	    	final Bridge bridge = new Bridge();
	         
	       //creates a north bound thread
	    	Thread Nbound = new Thread( new Runnable() 
	    	{
	             
	            
	            public void run() 
	            {
	             
	                while(true)
	                {
	                    //creates a new north bound car on the bridge
	                	Vehicle vehicle = new Vehicle(bridge);
	                    Thread car = new Thread(vehicle);//creates a new thread
	                    vehicle.setCarName("Northbound Car : "+car.getId());//gives a unique ID number to this car
	                    car.start();//starts the thread
	                    try
	                    {
	                        //random amount of time for the thread to sleep
	                    	TimeUnit.SECONDS.sleep((long)(Math.random()*15));
	                    }
	                    catch(InterruptedException iex)
	                    {
	                        iex.printStackTrace();
	                    }
	                }
	                 
	            }
	        });
	         
	        //creates a new south bound thread
	    	Thread Sbound = new Thread( new Runnable() 
	    	{
	             
	            
	            public void run() 
	            {
	                 
	                while(true)
	                {
	                    //creates a new south bound car on the bridge
	                	Vehicle vehicle = new Vehicle(bridge);
	                    Thread car = new Thread(vehicle);//creates a new thread
	                    vehicle.setCarName("Southbound Car : "+car.getId());//gives a unique ID number for this car
	                    car.start();//starts thread
	                    try
	                    {
	                        //random amount of time for the thread to sleep
	                    	TimeUnit.SECONDS.sleep((long)(Math.random()*15));
	                    }
	                    catch(InterruptedException iex)
	                    {
	                        iex.printStackTrace();
	                    }
	                }
	            }
	        });
	         
	        Nbound.start();//starts a north bound thread
	        Sbound.start();//starts a south bound thread
	    }
	 
	}
	 
	

