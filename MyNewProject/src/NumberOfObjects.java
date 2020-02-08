class Aabc
{
    static int i;
	public Aabc() 
	{
		i++;
	}
	public void Counter()
	{
		System.out.println(i);
	}
}
public class NumberOfObjects 
{
	@SuppressWarnings("unused")
	public static void main(String ab[])
	{
		Aabc obj1=new Aabc();
		Aabc obj2=new Aabc();
		Aabc obj3=new Aabc();
		obj1.Counter();
	}
}
