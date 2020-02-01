
public class EasySwap 
{
	public static void main(String ab[]) 
	{
		int a=5,b=6;
		b=a+b-(a=b);
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}
