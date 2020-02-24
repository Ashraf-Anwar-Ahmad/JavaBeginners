
public class InterfaceInJava8 
{
	public static void main(String ab[])
	{
		L ek=()->System.out.println("Showing....");
		ek.show();
		ek.run();
	}
}
interface L
{
	void show();
	default void run()
	{
		System.out.println("Default Interface Method");
	}
	
}