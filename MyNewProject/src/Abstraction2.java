
public class Abstraction2 
{
	public static void main(String  ab[])
	{
		phone ek=new Iphone();
		phone ek1=new Samsung();
		show(ek);
		show(ek1);
	}
	public static void show(phone obj)
	{
		obj.config();
	}
}

abstract class phone
{
	public abstract void config();
}

class Iphone extends phone
{
	public void config()
	{
		System.out.println("IPHONE");
	}
}

class Samsung extends phone
{
	public void config()
	{
		System.out.println("SAMSUNG");
	}
}