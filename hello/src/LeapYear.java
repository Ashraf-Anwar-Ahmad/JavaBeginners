import java.util.Scanner;
public class LeapYear {
	public static void main(String ab[])
	{
		int n;
		System.out.println("Enter a Year");
		Scanner ek=new Scanner(System.in);
		n=ek.nextInt();
		if(n%4!=0)
			System.out.println("Not a LeapYear");
		else if(n%100!=0)
			System.out.println("LeapYear");
		else if(n%400!=0)
			System.out.println("Not a LeapYear");
		else
			System.out.println("LeapYear");
	}
}
