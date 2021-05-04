public class GreeterTester{
public static void main(String[] args){

 Greeter worldGreeter = new Greeter("World");
 String greeting = worldGreeter.sayHello();
 System.out.println(greeting);

 Greeter universeGreeter=new Greeter("Universe");
 worldGreeter.swapNames(universeGreeter);
 String greeting2= universeGreeter.sayHello();
 System.out.println(greeting2);
} 
}
