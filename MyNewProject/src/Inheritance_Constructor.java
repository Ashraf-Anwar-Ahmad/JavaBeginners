
public class Inheritance_Constructor {
	public static void main(String ab[])
	{
		@SuppressWarnings("unused")
		Y ek=new Y(5);
		/*output will show Constructor of Parent class also because when object of sub class
		 *  is created , object of super class is also created 
		 *  constructor of parent class will automatically called after calling of child class
		 *  constructor*/
	}

}
class Z
{
	public Z()
	{
		System.out.println("In Z Default Constructor");
	}
	public Z(int i)
	{
		System.out.println("In Z Parameterized Constructor");
	}
}
class Y extends Z
{
	public Y()
	{
		System.out.println("In Y Defualt Constructor");
	}
	public Y(int i)
	{
		System.out.println("In Y Parameterized Constructor");
	}
}