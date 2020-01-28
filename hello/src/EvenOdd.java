import java.util.Scanner;
public class EvenOdd {
	public static void main(String ab[])
	{
		int n;
		System.out.println("Enter any Number");
		Scanner ek=new Scanner(System.in);
		n=ek.nextInt();
		if(n%2==0)
			System.out.println(n+" is a Even Number");
		else
			System.out.println(n+" is a Odd Number");
	}

}
