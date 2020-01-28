import java.util.Scanner;
public class PalindromeNum {
	public static void main(String ab[])
	{
		int x,n,r,s=0;
		System.out.println("Enter any number");
		Scanner ek=new Scanner(System.in);
		n=ek.nextInt();
		x=n;
		while(x>0)
		{
			r=x%10; //remainder add kr diya
			s=(s*10)+r;
			x=x/10;
		}
		if(s==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not");
	}
}
