import java.util.Scanner;
public class Ifdemo {
	public static void main(String ab[])
	{
		int i;
		System.out.println("Enter any Number");
		Scanner ek=new Scanner(System.in);
		i=ek.nextInt();
		ek.close();
		if(i%2==0)
		{
			System.out.println(i+" is an Even Number");
		}
		else
			System.out.println(i+" is a Odd Number");
	}
}
