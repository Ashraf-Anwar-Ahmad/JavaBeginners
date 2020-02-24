import java.util.Scanner;

public class StringOperation
{
	public static void main(String ab[])
	{
		Scanner ek=new Scanner(System.in);
		System.out.println("Enter two Strings");
		String s1=ek.nextLine();
		String s2=ek.nextLine();
		ek.close();
		String s3=s1.concat(s2);
		int l1=s1.length();
		int l2=s2.length();
		String s4=s1+s2;
		String s5=s1.toUpperCase();
		String s6=s2.toUpperCase();
		System.out.println("First String = "+s1+" , Length is "+l1+
				"\nSecond String = "+s2+" , Length is "+l2);
		System.out.println("Concatinate Method  "+s3+"\nConcatinate "+s4+"\nUpper Case "+s5+"\nUpper Case "+s6);
	}
}