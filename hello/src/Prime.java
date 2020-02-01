import java.util.Scanner;
public class Prime
{
	public static void main(String ab[])
	{
		int i,n;
		System.out.println("Enter the number");
		Scanner ek=new Scanner(System.in);
		n=ek.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				break;
		}
		if(i==n) 
			System.out.println("Prime Number");
		else
			System.out.print("Not a Prime Number");
	}
}