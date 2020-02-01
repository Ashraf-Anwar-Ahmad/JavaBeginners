
public class Swap {
	public static void main(String ab[])
	{
		int a=5;
		int b=6;
		System.out.println("Before Operation a is "+a);
		System.out.println("Before Operation b is "+b);
		System.out.println("By using Temperary Variable");//Extra memory wasted
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a is now "+a);
		System.out.println("b is now "+b);
		System.out.println("Without Taking Temporary variable");//Extra bit wasted
		a=5;
		b=6;
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("a is now "+a);
		System.out.println("b is now "+b);
		System.out.println("X-OR Operation");//Nothing is wasted
		a=5;
		b=6;
		a=b^a;
		b=a^b;
		a=a^b;
		System.out.println("a is now "+a);
		System.out.println("b is now "+b);
	}
}
