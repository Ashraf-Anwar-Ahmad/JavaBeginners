import java.util.Scanner;

public class ExceptionPart_1 
{
	public static void main(String ab[])
	{
		int i,j,k=0;
		System.out.println("Enter i and j");
		Scanner ek=new  Scanner(System.in);
		i=ek.nextInt();
		j=ek.nextInt();
		try
		{
			k=i/j;
		}
		catch(Exception e)
		{
			System.out.println("J cannot be Zero");
		}
		finally
		{
			System.out.println("Finally Hello");
		}
		System.out.println("k=i/j = "+k);
	}
}
