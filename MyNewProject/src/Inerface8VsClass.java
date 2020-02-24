// default methods
public class Inerface8VsClass {
	public static  void main(String ab[])
	{
		Cde ek=new Cde();
		ek.show();
	}
}
interface I
{
	default void show()
	{
		System.out.println("In I Interface");
	}
}
class Baa
{
	public void show()
	{
		System.out.println("IN Class Baa");
	}
}
class  Cde extends Baa implements I
{
	//it will give output of class Baa because class is more powerful then interface
}
