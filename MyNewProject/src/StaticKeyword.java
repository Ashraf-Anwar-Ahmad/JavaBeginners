class mp
{
	static int i;
	public static void show()
	{
		System.out.println("Hello");
		
		System.out.println(i);
	}
}
public class StaticKeyword {
	public static void main(String ab[])
	{
		mp.i=5;  //without creating an object
		
		mp.show(); //without creating an object

	}

}
