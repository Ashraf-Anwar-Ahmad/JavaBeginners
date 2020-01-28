import java.util.Scanner;
public class PalindromeStr {
	public static void main(String ab[])
	{
		int len,i;
		String name="",temp;
		Scanner na=new Scanner(System.in);
		System.out.println("Enter a String");
		name=na.nextLine();
		String ultaa="";
		len=name.length();
		for(i=len-1;i>=0;i--)
		{
			ultaa=ultaa+name.charAt(i);
		}
		System.out.println(ultaa);
		if(name.equals(ultaa))
		{
			System.out.println(ultaa+" is a Palindrome String");
		}
		else
			System.out.println(ultaa+" is not a Palindrome String");
	}
}
