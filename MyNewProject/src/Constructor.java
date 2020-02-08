
public class Constructor {
	public static void main(String ab[])
	{
		Abc ek=new Abc();
		ek=new Abc(5.5f);
		ek=new Abc(7,"oye");
		Imp obj=new Imp(5);
		
	}
}
class Imp//Implicit conversion
{
	public Imp(double h)
	{
		System.out.println("Int to Double Implicit conversion");
	}
}
class Abc
{
	public Abc() //constructor overloading
	{
		System.out.println("Default Constructor Hello");
	}
	public Abc(float k)
	{
		System.out.println("Parameterized Constructor Hello");
	}
	public Abc(int i,String j)
	{
		System.out.println("Multiple Parameterized Constructor");
	}

}
