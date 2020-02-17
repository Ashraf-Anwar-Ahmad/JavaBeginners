
public class SuperKeyword2 
{
	public static void main(String ab[])
	{
		Bcd ek=new Bcd();
		ek.showA();
	}
}

class bca
{
	public void showA()
	{
		System.out.println("In Const A");
	}
}
class Bcd extends bca
{
	public void showB()
	{
		super.showA();
		System.out.println("In Const B");
	}
}