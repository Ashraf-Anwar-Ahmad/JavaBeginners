
public class Poly_MethodOverloading 
{
	public static void main(String ab[])
	{
		Overloading ek=new Overloading();
		ek.show();
		ek.show(5);
	}
}
class Overloading
{
	public void show()
	{
		System.out.println("Default Show method");
	}
	public void show(int i)
	{
		System.out.println("Parameteric Show method");
	}
}