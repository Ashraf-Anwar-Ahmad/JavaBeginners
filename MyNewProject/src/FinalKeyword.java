
public class FinalKeyword 
{ 
	public static void main(String ab[])
	{
		final int i;//due to final we can not assign values again and again
		i=5;
		System.out.println(i);
	}
}
class Final
{
	final public void show()
	{
		System.out.println("hello");
	}
}
/*final class NotFinal extends Final
{
	public void show() //cannot overrided due to final method
	{
		System.out.println("Hi");
	}
}
class xyz extends NotFinal //can not inherit due to final
{
	
}*/