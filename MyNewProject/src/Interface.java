
public class Interface 
{
	public static void main(String ab[])
	{
		ABB ek=new CDD();
		BCC ek1=new CDD();
		ek.show();
		ek1.run();
		// ek.talk(); // cannot be called
		
		ABB ek2=new ABB()
				{
			public void show()
			{
				System.out.println("Anonymous");
			}
				};
		ek2.show();
	}
}
interface ABB
{
	public void show();
}
interface BCC
{
	public void run();
}
class CDD implements ABB,BCC //multiple implements
{
	public void show()
	{
		System.out.println("hello");
	}
	public void run()
	{
		System.out.println("Running....");
	}
	public void talk()
	{
		System.out.println("Talking");
	}
}