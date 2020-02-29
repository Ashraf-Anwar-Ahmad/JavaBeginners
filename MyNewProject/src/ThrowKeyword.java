import java.util.Scanner;

class AgeCheck extends RuntimeException
{
	public AgeCheck(String msg)
	{
		super(msg);
	}
}
public class ThrowKeyword 
{
	public static void main(String ab[])
	{
		Scanner ek=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=ek.nextInt();
		if(age<18)
		{
			throw new AgeCheck("NotEligible");
		}
		else
		{
			System.out.println("please Do Vote");
		}
	}
}
