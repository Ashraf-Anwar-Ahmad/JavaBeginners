
public class StaticBlock 
{	
	static
	{
		System.out.println("Hello World...it's in Static block 1");	
	}
	public static void main(String ab[])
	{
		System.out.println("In Main Method");
	}
	static {
		System.out.println("bye..in static block 2");
	}

}
/*static block always get executed first before main method because static block always 
called when the class is get loaded in the JVM*/