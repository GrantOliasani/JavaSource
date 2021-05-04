public class Greeter{
	public Greeter (String aName)
	{
	name=aName;
	}
	public String sayHello()
	{
	return "Hello, " + name + "!";
	}
	private String name;

	public void swapNames(Greeter other){
		this.name=other.name;
	}
}