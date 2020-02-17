
public class Abstraction 
{
	public static void main(String ab[])
	{
		//Robot non=new Robot();  // cannot instantiate it or object can not be created
		Robot ek=new Robot3();
		ek.move();
		ek.talk();
		ek.run();
		ek.stand();
	}
}

abstract class Robot //abstract class....
{
	public void move()
	{
		System.out.println("Moving.....");
	}
	public abstract void talk(); //abstract method....
	public abstract void run();
	public abstract void stand();
}
abstract class Robot2 extends Robot //abstract class...
{
	public void talk()
	{
		System.out.println("Talking.....");
	}
	public void run()
	{
		System.out.println("Running.....");
	}
}
class Robot3 extends Robot2 //concrete class bcoz it defines all the abstract methods
{
	public void stand()
	{
		System.out.println("Standing.....");
	}
}