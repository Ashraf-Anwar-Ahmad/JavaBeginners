import java.util.Scanner;
public class Largest 
{
	public static void main(String ab[])
	{
		int a,b,c;
		System.out.println("Enter The Three Numbers");
		Scanner ek=new Scanner(System.in);
		a=ek.nextInt();
		b=ek.nextInt();
		c=ek.nextInt();
		ek.close();
		if(a>b&&a>c)
			System.out.println("a is greatest");
		else if(b>c)
			System.out.println("b is greatest");
		else
			System.out.println("c is greatest");
	}
}
