import java.util.Scanner;
public class Factorial {
	public static void main(String ab[])
	{	int i,n,a=1;
		System.out.println("Enter a Number");
		Scanner ek=new Scanner(System.in);
		n=ek.nextInt();
		for(i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println("factorial is "+a);
	}

}
