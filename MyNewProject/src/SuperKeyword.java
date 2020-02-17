
public class SuperKeyword 
{
	public static void main(String ab[])
	{
		E ek=new E(5);
	}
} 
class D
{
	public D()
	{
		System.out.println("In Default const A");
	}
	public D(int i)
	{
		System.out.println("In Para const A");
	}
}
class E extends D
{
	public E() 
	{
		System.out.println("In Default const B");
	}
	public E(int i)
	{
		super(i);
		System.out.println("In Para const B");
	}
}