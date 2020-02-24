import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String ab[])
	{
		System.out.println("Enter any Number");
		Scanner ek=new Scanner(System.in);
		int n=ek.nextInt();
		System.out.println(n);
		
		String n2="";
		System.out.println("Enter any String");
		Scanner bk=new Scanner(System.in);
		n2=bk.nextLine();
		bk.close();
		System.out.println(n2);
	}
}
