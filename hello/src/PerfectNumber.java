import java.util.Scanner;
public class PerfectNumber 
{
	public static void main(String ab[])
	{
		int n;
		System.out.println("Enter any Number");
		Scanner ek=new Scanner(System.in);
		n=ek.nextInt();
		ek.close();
		boolean b= isPerfect(n);
		if(b)
			System.out.println(n+" is a Perfect Number");
		else
			System.out.println(n+" is not a Perfect Number");
	}

	public static boolean isPerfect(int n) 
	{	int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(n==sum)
			return true;
		
		return false;
	}
}