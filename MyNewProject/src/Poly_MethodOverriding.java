
public class Poly_MethodOverriding 
{
	public static void main(String ab[])
	{
		Overriding ek=new Overriding2();
		ek.show();
	}
	
}
class Overriding
{
	public void show()
	{
		System.out.println("Class 1");
	}
}
class Overriding2 extends Overriding
{
	public void show()
	{
		System.out.println("Class 2");
	}
}
